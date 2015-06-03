package com.scalaAsm.x86
package Instructions
package General

// Description: Return from procedure
// Category: general/branchstack

trait RETN extends InstructionDefinition {
  val mnemonic = "RETN"
}

object RETN extends ZeroOperands[RETN] with OneOperand[RETN] with RETNImpl

trait RETNImpl extends RETN {
  implicit object _0 extends OneOp[imm16] {
    val opcode: OneOpcode = 0xC2
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends NoOp{
    val opcode: OneOpcode = 0xC3
        override def hasImplicitOperand = true
  }
}
