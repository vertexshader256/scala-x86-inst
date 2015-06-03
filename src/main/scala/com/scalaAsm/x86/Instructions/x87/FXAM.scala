package com.scalaAsm.x86
package Instructions
package x87

// Description: Examine
// Category: general

trait FXAM extends InstructionDefinition {
  val mnemonic = "FXAM"
}

object FXAM extends ZeroOperands[FXAM] with FXAMImpl

trait FXAMImpl extends FXAM {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
