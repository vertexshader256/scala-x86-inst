package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add with Carry
// Category: general/arith/binary

trait ADC extends InstructionDefinition {
  val mnemonic = "ADC"
}

object ADC extends ADC with ADCImpl

trait ADCLow {
  self: ADC =>
  implicit object ADC_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x10 /r
  }

  implicit object ADC_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x11 /r
  }

  implicit object ADC_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x11 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object ADC_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x11 /r
    override def prefix = REX.W(true)
  }

  implicit object ADC_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x12 /r
  }

  implicit object ADC_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 2
  }

  implicit object ADC_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 2
  }

  implicit object ADC_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 2
  }

  implicit object ADC_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 2
    override def prefix = REX.W(true)
  }

  implicit object ADC_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 2
  }

  implicit object ADC_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 2
  }

  implicit object ADC_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 2
    override def prefix = REX.W(true)
  }
}

trait ADCImpl extends ADCLow {
  self: ADC =>
  implicit object ADC_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x13 /r
  }

  implicit object ADC_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x13 /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object ADC_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x13 /r
    override def prefix = REX.W(true)
  }

  implicit object ADC_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x14
    override def hasImplicitOperand = true
  }

  implicit object ADC_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x15
    override def hasImplicitOperand = true
  }

  implicit object ADC_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x15
    override def hasImplicitOperand = true
  }
}
