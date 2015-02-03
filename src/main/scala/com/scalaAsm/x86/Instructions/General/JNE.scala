package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not zero/not equal (ZF=1)
// Category: general/branch/cond

object JNE extends InstructionDefinition("JNE") with JNEImpl

trait JNEImpl {
  implicit object JNE_0 extends JNE._1[rel8] {
    val opcode: OneOpcode = 0x75
  }

  implicit object JNE_1 extends JNE._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
  }

  implicit object JNE_2 extends JNE._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
  }
}
