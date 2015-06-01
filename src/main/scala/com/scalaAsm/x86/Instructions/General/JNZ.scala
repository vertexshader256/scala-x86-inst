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
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x75
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x85)
    val format = ImmFormat
  }
}
