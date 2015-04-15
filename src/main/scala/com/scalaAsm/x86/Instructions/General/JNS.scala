package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not sign (SF=0)
// Category: general/branch/cond

trait JNS extends InstructionDefinition {
  val mnemonic = "JNS"
}

object JNS extends OneOperand[JNS] with JNSImpl

trait JNSImpl extends JNS {
  implicit object JNS_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x79
  }

  implicit object JNS_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x89)
  }

  implicit object JNS_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x89)
  }
}
