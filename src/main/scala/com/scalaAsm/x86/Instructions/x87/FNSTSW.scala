package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Status Word
// Category: general/control

object FNSTSW extends InstructionDefinition("FNSTSW") with FNSTSWImpl

trait FNSTSWImpl {
  implicit object FNSTSW_0 extends FNSTSW._1[m16] {
    val opcode: OneOpcode = 0xDD /+ 7
  }

  implicit object FNSTSW_1 extends FNSTSW._0 {
    val opcode: OneOpcode = 0xDF /+ 4
    override def hasImplicitOperand = true
  }
}
