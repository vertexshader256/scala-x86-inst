package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not overflow (OF=0)
// Category: general/branch/cond

object JNO extends InstructionDefinition("JNO") with JNOImpl

trait JNOImpl {
  implicit object JNO_0 extends JNO._1[rel8] {
    val opcode: OneOpcode = 0x71
  }

  implicit object JNO_1 extends JNO._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x81)
  }

  implicit object JNO_2 extends JNO._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x81)
  }
}
