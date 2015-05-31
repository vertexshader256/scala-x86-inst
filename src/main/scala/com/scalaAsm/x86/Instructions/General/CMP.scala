package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Two Operands
// Category: general/arith/binary

trait CMP extends InstructionDefinition {
  val mnemonic = "CMP"
}

object CMP extends OneOperand[CMP] with TwoOperands[CMP] with CMPImpl

trait CMPLow extends CMP {
  implicit object CMP_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x38 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object CMP_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x39 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object CMP_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x39 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object CMP_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x39 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object CMP_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x3A /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMP_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 7
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object CMP_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 7
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object CMP_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 7
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object CMP_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 7
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object CMP_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object CMP_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object CMP_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }
}

trait CMPImpl extends CMPLow {
  implicit object CMP_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x3B /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMP_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x3B /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMP_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x3B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMP_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x3C
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object CMP_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x3D
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object CMP_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x3D
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
