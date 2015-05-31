package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Integer Subtraction with Borrow
// Category: general/arith/binary

trait SBB extends InstructionDefinition {
  val mnemonic = "SBB"
}

object SBB extends OneOperand[SBB] with TwoOperands[SBB] with SBBImpl

trait SBBLow extends SBB {
  implicit object SBB_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x18 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object SBB_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x19 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object SBB_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x19 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object SBB_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x19 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object SBB_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x1A /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object SBB_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 3
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SBB_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 3
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SBB_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 3
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SBB_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 3
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SBB_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SBB_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SBB_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }
}

trait SBBImpl extends SBBLow {
  implicit object SBB_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x1B /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object SBB_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x1B /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object SBB_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x1B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object SBB_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x1C
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object SBB_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x1D
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object SBB_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x1D
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
