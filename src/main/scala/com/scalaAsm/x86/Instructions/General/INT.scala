package com.scalaAsm.x86
package Instructions
package General

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait INT extends InstructionDefinition {
  val mnemonic = "INT"
}

object INT extends OneOperand[INT] with INTImpl

trait INTImpl extends INT {
  implicit object _0 extends OneOp[imm8] {
    val opcode: OneOpcode = 0xCD
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
