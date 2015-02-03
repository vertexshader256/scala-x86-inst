package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Status Word
// Category: general/control

object FSTSW extends InstructionDefinition("FSTSW") with FSTSWImpl

trait FSTSWImpl {
  implicit object FSTSW_0 extends FSTSW._1[m16] {
    val opcode: OneOpcode = 0xDD /+ 7
  }

  implicit object FSTSW_1 extends FSTSW._0 {
    val opcode: OneOpcode = 0xDF /+ 4
    override def hasImplicitOperand = true
  }
}
