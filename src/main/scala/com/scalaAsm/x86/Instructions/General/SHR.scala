package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Shift
// Category: general/shftrot

trait SHR extends InstructionDefinition {
  val mnemonic = "SHR"
}

object SHR extends SHR with SHRImpl

trait SHRImpl {
  self: SHR =>
  implicit object SHR_0 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 5
  }

  implicit object SHR_1 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 5
  }

  implicit object SHR_2 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 5
  }

  implicit object SHR_3 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 5
    override def prefix = REX.W(true)
  }

  implicit object SHR_4 extends _1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object SHR_5 extends _1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object SHR_6 extends _1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object SHR_7 extends _1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 5
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
