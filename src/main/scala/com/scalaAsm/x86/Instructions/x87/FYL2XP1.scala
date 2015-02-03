package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compute y × log2(x+1) and Pop
// Category: general/trans

object FYL2XP1 extends InstructionDefinition("FYL2XP1") with FYL2XP1Impl

trait FYL2XP1Impl {
  implicit object FYL2XP1_0 extends FYL2XP1._0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
