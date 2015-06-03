package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if sign (SF=1)
// Category: general/branch/cond

trait JS extends InstructionDefinition {
  val mnemonic = "JS"
}

object JS extends OneOperand[JS] with JSImpl

trait JSImpl extends JS {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x78
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x88)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x88)
    val format = ImmFormat
  }
}
