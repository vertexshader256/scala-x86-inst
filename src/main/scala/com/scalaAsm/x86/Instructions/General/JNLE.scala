package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/branch/cond

trait JNLE extends InstructionDefinition {
  val mnemonic = "JNLE"
}

object JNLE extends OneOperand[JNLE] with JNLEImpl

trait JNLEImpl extends JNLE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7F
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8F)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8F)
    val format = ImmFormat
  }
}
