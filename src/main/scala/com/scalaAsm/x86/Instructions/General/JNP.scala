package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not parity/parity odd
// Category: general/branch/cond

object JNP extends InstructionDefinition("JNP") with JNPImpl

trait JNPImpl {
  implicit object JNP_0 extends JNP._1[rel8] {
    val opcode: OneOpcode = 0x7B
  }

  implicit object JNP_1 extends JNP._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
  }

  implicit object JNP_2 extends JNP._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
  }
}
