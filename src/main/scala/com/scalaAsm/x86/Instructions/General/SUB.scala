package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Subtract
// Category: general/arith/binary

object SUB extends InstructionDefinition("SUB") with SUBImpl

trait SUBLow {
  implicit object SUB_0 extends SUB._2[rm8, r8] {
    val opcode: OneOpcode = 0x28 /r
  }

  implicit object SUB_1 extends SUB._2[rm16, r16] {
    val opcode: OneOpcode = 0x29 /r
  }

  implicit object SUB_2 extends SUB._2[rm32, r32] {
    val opcode: OneOpcode = 0x29 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object SUB_3 extends SUB._2[rm64, r64] {
    val opcode: OneOpcode = 0x29 /r
    override def prefix = REX.W(true)
  }

  implicit object SUB_4 extends SUB._2[r8, rm8] {
    val opcode: OneOpcode = 0x2A /r
  }

  implicit object SUB_5 extends SUB._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 5
  }

  implicit object SUB_6 extends SUB._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 5
  }

  implicit object SUB_7 extends SUB._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 5
  }

  implicit object SUB_8 extends SUB._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 5
    override def prefix = REX.W(true)
  }

  implicit object SUB_9 extends SUB._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 5
  }

  implicit object SUB_10 extends SUB._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 5
  }

  implicit object SUB_11 extends SUB._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 5
    override def prefix = REX.W(true)
  }
}

trait SUBImpl extends SUBLow {
  implicit object SUB_12 extends SUB._2[r16, rm16] {
    val opcode: OneOpcode = 0x2B /r
  }

  implicit object SUB_13 extends SUB._2[r32, rm32] {
    val opcode: OneOpcode = 0x2B /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object SUB_14 extends SUB._2[r64, rm64] {
    val opcode: OneOpcode = 0x2B /r
    override def prefix = REX.W(true)
  }

  implicit object SUB_15 extends SUB._1[imm8] {
    val opcode: OneOpcode = 0x2C
    override def hasImplicitOperand = true
  }

  implicit object SUB_16 extends SUB._1[imm16] {
    val opcode: OneOpcode = 0x2D
    override def hasImplicitOperand = true
  }

  implicit object SUB_17 extends SUB._1[imm32] {
    val opcode: OneOpcode = 0x2D
    override def hasImplicitOperand = true
  }
}
