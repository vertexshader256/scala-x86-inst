package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unsigned Multiply
// Category: general/arith/binary

trait MUL extends InstructionDefinition {
  val mnemonic = "MUL"
}

object MUL extends MUL with MULImpl

trait MULImpl {
  self: MUL =>
  implicit object MUL_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 4
    override def hasImplicitOperand = true
  }

  implicit object MUL_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 4
    override def hasImplicitOperand = true
  }

  implicit object MUL_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 4
    override def hasImplicitOperand = true
  }

  implicit object MUL_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 4
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
