package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical Exclusive OR
// Category: general/logical

object XOR extends InstructionDefinition("XOR") with XORImpl

trait XORLow {
  implicit object XOR_0 extends XOR._2[rm8, r8] {
    val opcode: OneOpcode = 0x30 /r
  }

  implicit object XOR_1 extends XOR._2[rm16, r16] {
    val opcode: OneOpcode = 0x31 /r
  }

  implicit object XOR_2 extends XOR._2[rm32, r32] {
    val opcode: OneOpcode = 0x31 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object XOR_3 extends XOR._2[rm64, r64] {
    val opcode: OneOpcode = 0x31 /r
    override def prefix = REX.W(true)
  }

  implicit object XOR_4 extends XOR._2[r8, rm8] {
    val opcode: OneOpcode = 0x32 /r
  }

  implicit object XOR_5 extends XOR._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 6
  }

  implicit object XOR_6 extends XOR._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 6
  }

  implicit object XOR_7 extends XOR._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 6
  }

  implicit object XOR_8 extends XOR._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 6
    override def prefix = REX.W(true)
  }

  implicit object XOR_9 extends XOR._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 6
  }

  implicit object XOR_10 extends XOR._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 6
  }

  implicit object XOR_11 extends XOR._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 6
    override def prefix = REX.W(true)
  }
}

trait XORImpl extends XORLow {
  implicit object XOR_12 extends XOR._2[r16, rm16] {
    val opcode: OneOpcode = 0x33 /r
  }

  implicit object XOR_13 extends XOR._2[r32, rm32] {
    val opcode: OneOpcode = 0x33 /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object XOR_14 extends XOR._2[r64, rm64] {
    val opcode: OneOpcode = 0x33 /r
    override def prefix = REX.W(true)
  }

  implicit object XOR_15 extends XOR._1[imm8] {
    val opcode: OneOpcode = 0x34
    override def hasImplicitOperand = true
  }

  implicit object XOR_16 extends XOR._1[imm16] {
    val opcode: OneOpcode = 0x35
    override def hasImplicitOperand = true
  }

  implicit object XOR_17 extends XOR._1[imm32] {
    val opcode: OneOpcode = 0x35
    override def hasImplicitOperand = true
  }
}
