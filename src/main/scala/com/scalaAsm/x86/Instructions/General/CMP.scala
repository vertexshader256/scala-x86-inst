package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Two Operands
// Category: general/arith/binary

object CMP extends InstructionDefinition("CMP") with CMPImpl

trait CMPLow {
  implicit object CMP_0 extends CMP._2[rm8, r8] {
    val opcode: OneOpcode = 0x38 /r
  }

  implicit object CMP_1 extends CMP._2[rm16, r16] {
    val opcode: OneOpcode = 0x39 /r
  }

  implicit object CMP_2 extends CMP._2[rm32, r32] {
    val opcode: OneOpcode = 0x39 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMP_3 extends CMP._2[rm64, r64] {
    val opcode: OneOpcode = 0x39 /r
    override def prefix = REX.W(true)
  }

  implicit object CMP_4 extends CMP._2[r8, rm8] {
    val opcode: OneOpcode = 0x3A /r
  }

  implicit object CMP_5 extends CMP._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 7
  }

  implicit object CMP_6 extends CMP._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 7
  }

  implicit object CMP_7 extends CMP._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 7
  }

  implicit object CMP_8 extends CMP._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 7
    override def prefix = REX.W(true)
  }

  implicit object CMP_9 extends CMP._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
  }

  implicit object CMP_10 extends CMP._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
  }

  implicit object CMP_11 extends CMP._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    override def prefix = REX.W(true)
  }
}

trait CMPImpl extends CMPLow {
  implicit object CMP_12 extends CMP._2[r16, rm16] {
    val opcode: OneOpcode = 0x3B /r
  }

  implicit object CMP_13 extends CMP._2[r32, rm32] {
    val opcode: OneOpcode = 0x3B /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMP_14 extends CMP._2[r64, rm64] {
    val opcode: OneOpcode = 0x3B /r
    override def prefix = REX.W(true)
  }

  implicit object CMP_15 extends CMP._1[imm8] {
    val opcode: OneOpcode = 0x3C
    override def hasImplicitOperand = true
  }

  implicit object CMP_16 extends CMP._1[imm16] {
    val opcode: OneOpcode = 0x3D
    override def hasImplicitOperand = true
  }

  implicit object CMP_17 extends CMP._1[imm32] {
    val opcode: OneOpcode = 0x3D
    override def hasImplicitOperand = true
  }
}
