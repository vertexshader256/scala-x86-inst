package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not overflow (OF=0)
// Category: general/branch/cond

trait JNO extends InstructionDefinition {
  val mnemonic = "JNO"
}

object JNO extends OneOperand[JNO] with JNOImpl

trait JNOImpl extends JNO {
  implicit object JNO_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x71
    val explicitFormat = new ImmFormat{}
  }

  implicit object JNO_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x81)
    val explicitFormat = new ImmFormat{}
  }

  implicit object JNO_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x81)
    val explicitFormat = new ImmFormat{}
  }
}
