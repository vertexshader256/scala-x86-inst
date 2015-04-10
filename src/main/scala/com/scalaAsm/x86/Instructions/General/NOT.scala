package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: One's Complement Negation
// Category: general/logical

trait NOT extends InstructionDefinition {
  val mnemonic = "NOT"
}

object NOT extends NOT with OneOperand[NOT] with NOTImpl

trait NOTImpl {
  self: NOT =>
  implicit object NOT_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 2
  }

  implicit object NOT_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 2
  }

  implicit object NOT_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 2
  }

  implicit object NOT_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 2
    override def prefix = REX.W(true)
  }
}
