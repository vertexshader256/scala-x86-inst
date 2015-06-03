package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not sign (SF=0)
// Category: general/branch/cond

trait JNS extends InstructionDefinition {
  val mnemonic = "JNS"
}

object JNS extends OneOperand[JNS] with JNSImpl

trait JNSImpl extends JNS {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x79
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x89)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x89)
    val format = ImmFormat
  }
}
