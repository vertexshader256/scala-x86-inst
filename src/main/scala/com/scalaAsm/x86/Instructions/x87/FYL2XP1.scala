package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compute y × log2(x+1) and Pop
// Category: general/trans

trait FYL2XP1 extends InstructionDefinition {
  val mnemonic = "FYL2XP1"
}

object FYL2XP1 extends ZeroOperands[FYL2XP1] with FYL2XP1Impl

trait FYL2XP1Impl extends FYL2XP1 {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
