package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical Inclusive OR
// Category: general/logical

object OR extends InstructionDefinition("OR") with ORImpl

trait ORLow {
  implicit object OR_0 extends OR._2[rm8, r8] {
    val opcode: OneOpcode = 0x08 /r
  }

  implicit object OR_1 extends OR._2[rm16, r16] {
    val opcode: OneOpcode = 0x09 /r
  }

  implicit object OR_2 extends OR._2[rm32, r32] {
    val opcode: OneOpcode = 0x09 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object OR_3 extends OR._2[rm64, r64] {
    val opcode: OneOpcode = 0x09 /r
    override def prefix = REX.W(true)
  }

  implicit object OR_4 extends OR._2[r8, rm8] {
    val opcode: OneOpcode = 0x0A /r
  }

  implicit object OR_5 extends OR._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 1
  }

  implicit object OR_6 extends OR._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 1
  }

  implicit object OR_7 extends OR._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 1
  }

  implicit object OR_8 extends OR._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 1
    override def prefix = REX.W(true)
  }

  implicit object OR_9 extends OR._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 1
  }

  implicit object OR_10 extends OR._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 1
  }

  implicit object OR_11 extends OR._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 1
    override def prefix = REX.W(true)
  }
}

trait ORImpl extends ORLow {
  implicit object OR_12 extends OR._2[r16, rm16] {
    val opcode: OneOpcode = 0x0B /r
  }

  implicit object OR_13 extends OR._2[r32, rm32] {
    val opcode: OneOpcode = 0x0B /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object OR_14 extends OR._2[r64, rm64] {
    val opcode: OneOpcode = 0x0B /r
    override def prefix = REX.W(true)
  }

  implicit object OR_15 extends OR._1[imm8] {
    val opcode: OneOpcode = 0x0C
    override def hasImplicitOperand = true
  }

  implicit object OR_16 extends OR._1[imm16] {
    val opcode: OneOpcode = 0x0D
    override def hasImplicitOperand = true
  }

  implicit object OR_17 extends OR._1[imm32] {
    val opcode: OneOpcode = 0x0D
    override def hasImplicitOperand = true
  }
}
