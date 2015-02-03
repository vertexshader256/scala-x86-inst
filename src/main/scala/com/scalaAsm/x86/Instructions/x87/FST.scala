package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Floating Point Value
// Category: general/datamov

object FST extends InstructionDefinition("FST") with FSTImpl

trait FSTImpl {
  implicit object FST_0 extends FST._1[m32] {
    val opcode: OneOpcode = 0xD9 /+ 2
    override def hasImplicitOperand = true
  }

  implicit object FST_1 extends FST._1[m64] {
    val opcode: OneOpcode = 0xDD /+ 2
    override def hasImplicitOperand = true
  }
}
