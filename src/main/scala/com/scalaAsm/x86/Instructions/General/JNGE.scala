package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if less/not greater (SF!=OF)
// Category: general/branch/cond

trait JNGE extends InstructionDefinition {
  val mnemonic = "JNGE"
}

object JNGE extends OneOperand[JNGE] with JNGEImpl

trait JNGEImpl extends JNGE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7C
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8C)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8C)
    val format = ImmFormat
  }
}
