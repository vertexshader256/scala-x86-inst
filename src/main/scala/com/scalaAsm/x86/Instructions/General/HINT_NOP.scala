package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Hintable NOP
// Category: general/control

trait HINT_NOP extends InstructionDefinition {
  val mnemonic = "HINT_NOP"
}

object HINT_NOP extends OneOperand[HINT_NOP] with HINT_NOPImpl

trait HINT_NOPImpl extends HINT_NOP {
  implicit object HINT_NOP_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x18)
    val format = RmFormat
  }

  implicit object HINT_NOP_1 extends _1[rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x18)
    val format = RmFormat
  }
}
