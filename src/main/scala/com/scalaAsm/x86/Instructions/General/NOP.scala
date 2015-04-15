package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: No Operation
// Category: general/control

trait NOP extends InstructionDefinition {
  val mnemonic = "NOP"
}

object NOP extends ZeroOperands[NOP] with OneOperand[NOP] with NOPImpl

trait NOPLow extends NOP {
  implicit object NOP_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x0D)
  }

  implicit object NOP_1 extends _1[rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x0D)
  }
}

trait NOPImpl extends NOPLow {
  implicit object NOP_2 extends _0 {
    val opcode: OneOpcode = 0x90
  }
}
