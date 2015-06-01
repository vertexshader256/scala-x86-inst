package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not less/greater or equal (SF=OF)
// Category: general/branch/cond

trait JGE extends InstructionDefinition {
  val mnemonic = "JGE"
}

object JGE extends OneOperand[JGE] with JGEImpl

trait JGEImpl extends JGE {
  implicit object JGE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7D
    val format = ImmFormat
  }

  implicit object JGE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }

  implicit object JGE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }
}
