package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if sign (SF=1)
// Category: general/branch/cond

trait JS extends InstructionDefinition {
  val mnemonic = "JS"
}

object JS extends OneOperand[JS] with JSImpl

trait JSImpl extends JS {
  implicit object JS_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x78
    val format = ImmFormat
  }

  implicit object JS_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x88)
    val format = ImmFormat
  }

  implicit object JS_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x88)
    val format = ImmFormat
  }
}
