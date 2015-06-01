package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not parity/parity odd
// Category: general/branch/cond

trait JNP extends InstructionDefinition {
  val mnemonic = "JNP"
}

object JNP extends OneOperand[JNP] with JNPImpl

trait JNPImpl extends JNP {
  implicit object JNP_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7B
    val format = ImmFormat
  }

  implicit object JNP_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
    val format = ImmFormat
  }

  implicit object JNP_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8B)
    val format = ImmFormat
  }
}
