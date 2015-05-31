package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not zero/not equal (ZF=1)
// Category: general/branch/cond

trait JNZ extends InstructionDefinition {
  val mnemonic = "JNZ"
}

object JNZ extends OneOperand[JNZ] with JNZImpl

trait JNZImpl extends JNZ {
  implicit object JNZ_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x75
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JNZ_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JNZ_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
    val format = ImmFormat
    val hasRMByte = false
  }
}
