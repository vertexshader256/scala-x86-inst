package com.scalaAsm.x86
package Instructions
package General

// Description: Hintable NOP
// Category: general/control

trait HINT_NOP extends InstructionDefinition {
  val mnemonic = "HINT_NOP"
}

object HINT_NOP extends OneOperand[HINT_NOP] with HINT_NOPImpl

trait HINT_NOPImpl extends HINT_NOP {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x18)
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x18)
    val format = RmFormat
  }
}
