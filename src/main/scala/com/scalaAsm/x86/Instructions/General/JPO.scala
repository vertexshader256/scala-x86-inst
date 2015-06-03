package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not parity/parity odd
// Category: general/branch/cond

trait JPO extends InstructionDefinition {
  val mnemonic = "JPO"
}

object JPO extends OneOperand[JPO] with JPOImpl

trait JPOImpl extends JPO {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7B
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
    val format = ImmFormat
  }
}
