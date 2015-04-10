package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if zero/equal (ZF=0)
// Category: general/branch/cond

trait JE extends InstructionDefinition {
  val mnemonic = "JE"
}

object JE extends JE with OneOperand[JE] with JEImpl

trait JEImpl {
  self: JE =>
  implicit object JE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x74
  }

  implicit object JE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x84)
  }

  implicit object JE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x84)
  }
}
