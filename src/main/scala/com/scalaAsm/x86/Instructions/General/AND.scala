package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical AND
// Category: general/logical

object AND extends InstructionDefinition("AND") with ANDImpl

trait ANDLow {
  implicit object AND_0 extends AND._2[rm8, r8] {
    val opcode: OneOpcode = 0x20 /r
  }

  implicit object AND_1 extends AND._2[rm16, r16] {
    val opcode: OneOpcode = 0x21 /r
  }

  implicit object AND_2 extends AND._2[rm32, r32] {
    val opcode: OneOpcode = 0x21 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object AND_3 extends AND._2[rm64, r64] {
    val opcode: OneOpcode = 0x21 /r
    override def prefix = REX.W(true)
  }

  implicit object AND_4 extends AND._2[r8, rm8] {
    val opcode: OneOpcode = 0x22 /r
  }

  implicit object AND_5 extends AND._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 4
  }

  implicit object AND_6 extends AND._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 4
  }

  implicit object AND_7 extends AND._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 4
  }

  implicit object AND_8 extends AND._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 4
    override def prefix = REX.W(true)
  }

  implicit object AND_9 extends AND._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 4
  }

  implicit object AND_10 extends AND._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 4
  }

  implicit object AND_11 extends AND._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 4
    override def prefix = REX.W(true)
  }
}

trait ANDImpl extends ANDLow {
  implicit object AND_12 extends AND._2[r16, rm16] {
    val opcode: OneOpcode = 0x23 /r
  }

  implicit object AND_13 extends AND._2[r32, rm32] {
    val opcode: OneOpcode = 0x23 /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object AND_14 extends AND._2[r64, rm64] {
    val opcode: OneOpcode = 0x23 /r
    override def prefix = REX.W(true)
  }

  implicit object AND_15 extends AND._1[imm8] {
    val opcode: OneOpcode = 0x24
    override def hasImplicitOperand = true
  }

  implicit object AND_16 extends AND._1[imm16] {
    val opcode: OneOpcode = 0x25
    override def hasImplicitOperand = true
  }

  implicit object AND_17 extends AND._1[imm32] {
    val opcode: OneOpcode = 0x25
    override def hasImplicitOperand = true
  }
}
