package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if below/not above or equal/carry (CF=1)
// Category: general/branch/cond

trait JNAE extends InstructionDefinition {
  val mnemonic = "JNAE"
}

object JNAE extends OneOperand[JNAE] with JNAEImpl

trait JNAEImpl extends JNAE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x72
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
    val format = ImmFormat
  }
}
