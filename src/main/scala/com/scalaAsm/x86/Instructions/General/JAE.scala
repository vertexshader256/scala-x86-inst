package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not below/above or equal/not carry (CF=0)
// Category: general/branch/cond

trait JAE extends InstructionDefinition {
  val mnemonic = "JAE"
}

object JAE extends OneOperand[JAE] with JAEImpl

trait JAEImpl extends JAE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x73
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
    val format = ImmFormat
  }
}
