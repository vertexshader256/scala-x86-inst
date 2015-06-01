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
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7D
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }
}
