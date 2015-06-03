package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not overflow (OF=0)
// Category: general/branch/cond

trait JNO extends InstructionDefinition {
  val mnemonic = "JNO"
}

object JNO extends OneOperand[JNO] with JNOImpl

trait JNOImpl extends JNO {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x71
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x81)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x81)
    val format = ImmFormat
  }
}
