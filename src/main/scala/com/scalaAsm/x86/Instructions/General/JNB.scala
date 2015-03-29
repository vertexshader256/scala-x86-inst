package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not below/above or equal/not carry (CF=0)
// Category: general/branch/cond

trait JNB extends InstructionDefinition {
  val mnemonic = "JNB"
}

object JNB extends JNB with JNBImpl

trait JNBImpl {
  self: JNB =>
  implicit object JNB_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x73
  }

  implicit object JNB_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
  }

  implicit object JNB_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
  }
}
