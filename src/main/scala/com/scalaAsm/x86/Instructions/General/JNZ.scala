package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not zero/not equal (ZF=1)
// Category: general/branch/cond

object JNZ extends InstructionDefinition("JNZ") with JNZImpl

trait JNZImpl {
  implicit object JNZ_0 extends JNZ._1[rel8] {
    val opcode: OneOpcode = 0x75
  }

  implicit object JNZ_1 extends JNZ._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
  }

  implicit object JNZ_2 extends JNZ._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
  }
}
