package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if zero/equal (ZF=0)
// Category: general/branch/cond

trait JZ extends InstructionDefinition {
  val mnemonic = "JZ"
}

object JZ extends OneOperand[JZ] with JZImpl

trait JZImpl extends JZ {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x74
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x84)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x84)
    val format = ImmFormat
  }
}
