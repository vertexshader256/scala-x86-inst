package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not below or equal/above (CF=0 AND ZF=0)
// Category: general/branch/cond

trait JNBE extends InstructionDefinition {
  val mnemonic = "JNBE"
}

object JNBE extends OneOperand[JNBE] with JNBEImpl

trait JNBEImpl extends JNBE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x77
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x87)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x87)
    val format = ImmFormat
  }
}
