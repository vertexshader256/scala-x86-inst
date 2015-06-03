package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/branch/cond

trait JNG extends InstructionDefinition {
  val mnemonic = "JNG"
}

object JNG extends OneOperand[JNG] with JNGImpl

trait JNGImpl extends JNG {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7E
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
    val format = ImmFormat
  }
}
