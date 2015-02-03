package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if zero/equal (ZF=0)
// Category: general/branch/cond

object JZ extends InstructionDefinition("JZ") with JZImpl

trait JZImpl {
  implicit object JZ_0 extends JZ._1[rel8] {
    val opcode: OneOpcode = 0x74
  }

  implicit object JZ_1 extends JZ._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x84)
  }

  implicit object JZ_2 extends JZ._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x84)
  }
}
