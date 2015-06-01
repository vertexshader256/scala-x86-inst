package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical Compare
// Category: general/arith/binary

trait TEST extends InstructionDefinition {
  val mnemonic = "TEST"
}

object TEST extends OneOperand[TEST] with TwoOperands[TEST] with TESTImpl

trait TESTLow extends TEST {
  implicit object TEST_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x84 /r
    val format = MemRegFormat
  }

  implicit object TEST_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x85 /r
    val format = MemRegFormat
  }

  implicit object TEST_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x85 /r
    val format = MemRegFormat
  }

  implicit object TEST_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x85 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object TEST_4 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xF6 /+ 0
    val format = RmImmFormat
  }

  implicit object TEST_5 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0xF7 /+ 0
    val format = RmImmFormat
  }

  implicit object TEST_6 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0xF7 /+ 0
    val format = RmImmFormat
  }

  implicit object TEST_7 extends _2[rm64, imm64] {
    val opcode: OneOpcode = 0xF7 /+ 0
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait TESTImpl extends TESTLow {
  implicit object TEST_8 extends _1[imm8] {
    val opcode: OneOpcode = 0xA8
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object TEST_9 extends _1[imm16] {
    val opcode: OneOpcode = 0xA9
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object TEST_10 extends _1[imm32] {
    val opcode: OneOpcode = 0xA9
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
