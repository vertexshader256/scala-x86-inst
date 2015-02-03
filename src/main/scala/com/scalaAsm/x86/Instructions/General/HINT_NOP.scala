package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Hintable NOP
// Category: general/control

object HINT_NOP extends InstructionDefinition("HINT_NOP") with HINT_NOPImpl

trait HINT_NOPImpl {
  implicit object HINT_NOP_0 extends HINT_NOP._1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x18)
  }

  implicit object HINT_NOP_1 extends HINT_NOP._1[rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x18)
  }
}
