package com.scalaAsm.x86
package Instructions
package x87

// Description: Compute y × log2x and Pop
// Category: general/trans

trait FYL2X extends InstructionDefinition {
  val mnemonic = "FYL2X"
}

object FYL2X extends ZeroOperands[FYL2X] with FYL2XImpl

trait FYL2XImpl extends FYL2X {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
  }
}
