package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if below or equal/not above (CF=1 AND ZF=1)
// Category: general/branch/cond

trait JBE extends InstructionDefinition {
  val mnemonic = "JBE"
}

object JBE extends OneOperand[JBE] with JBEImpl

trait JBEImpl extends JBE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x76
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x86)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x86)
    val format = ImmFormat
  }
}
