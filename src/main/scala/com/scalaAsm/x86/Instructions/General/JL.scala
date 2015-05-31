package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if less/not greater (SF!=OF)
// Category: general/branch/cond

trait JL extends InstructionDefinition {
  val mnemonic = "JL"
}

object JL extends OneOperand[JL] with JLImpl

trait JLImpl extends JL {
  implicit object JL_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7C
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JL_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8C)
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JL_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8C)
    val format = ImmFormat
    val hasRMByte = false
  }
}
