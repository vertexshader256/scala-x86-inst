package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not less/greater or equal (SF=OF)
// Category: general/branch/cond

object JGE extends InstructionDefinition("JGE") with JGEImpl

trait JGEImpl {
  implicit object JGE_0 extends JGE._1[rel8] {
    val opcode: OneOpcode = 0x7D
  }

  implicit object JGE_1 extends JGE._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
  }

  implicit object JGE_2 extends JGE._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
  }
}
