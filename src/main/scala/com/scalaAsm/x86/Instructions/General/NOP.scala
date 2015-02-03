package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: No Operation
// Category: general/control

object NOP extends InstructionDefinition("NOP") with NOPImpl

trait NOPLow {
  implicit object NOP_0 extends NOP._1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x0D)
  }

  implicit object NOP_1 extends NOP._1[rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x0D)
  }
}

trait NOPImpl extends NOPLow {
  implicit object NOP_2 extends NOP._0 {
    val opcode: OneOpcode = 0x90
  }
}
