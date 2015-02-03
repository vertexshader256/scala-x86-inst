package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not sign (SF=0)
// Category: general/branch/cond

object JNS extends InstructionDefinition("JNS") with JNSImpl

trait JNSImpl {
  implicit object JNS_0 extends JNS._1[rel8] {
    val opcode: OneOpcode = 0x79
  }

  implicit object JNS_1 extends JNS._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x89)
  }

  implicit object JNS_2 extends JNS._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x89)
  }
}
