package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not less/greater or equal (SF=OF)
// Category: general/branch/cond

trait JNL extends InstructionDefinition {
  val mnemonic = "JNL"
}

object JNL extends OneOperand[JNL] with JNLImpl

trait JNLImpl extends JNL {
  implicit object JNL_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7D
    val format = ImmFormat
  }

  implicit object JNL_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }

  implicit object JNL_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }
}
