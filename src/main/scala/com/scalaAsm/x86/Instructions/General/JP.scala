package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if parity/parity even (PF=1)
// Category: general/branch/cond

trait JP extends InstructionDefinition {
  val mnemonic = "JP"
}

object JP extends OneOperand[JP] with JPImpl

trait JPImpl extends JP {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7A
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8A)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8A)
    val format = ImmFormat
  }
}
