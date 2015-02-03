package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Integer Subtraction with Borrow
// Category: general/arith/binary

object SBB extends InstructionDefinition("SBB") with SBBImpl

trait SBBLow {
  implicit object SBB_0 extends SBB._2[rm8, r8] {
    val opcode: OneOpcode = 0x18 /r
  }

  implicit object SBB_1 extends SBB._2[rm16, r16] {
    val opcode: OneOpcode = 0x19 /r
  }

  implicit object SBB_2 extends SBB._2[rm32, r32] {
    val opcode: OneOpcode = 0x19 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object SBB_3 extends SBB._2[rm64, r64] {
    val opcode: OneOpcode = 0x19 /r
    override def prefix = REX.W(true)
  }

  implicit object SBB_4 extends SBB._2[r8, rm8] {
    val opcode: OneOpcode = 0x1A /r
  }

  implicit object SBB_5 extends SBB._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 3
  }

  implicit object SBB_6 extends SBB._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 3
  }

  implicit object SBB_7 extends SBB._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 3
  }

  implicit object SBB_8 extends SBB._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 3
    override def prefix = REX.W(true)
  }

  implicit object SBB_9 extends SBB._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
  }

  implicit object SBB_10 extends SBB._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
  }

  implicit object SBB_11 extends SBB._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    override def prefix = REX.W(true)
  }
}

trait SBBImpl extends SBBLow {
  implicit object SBB_12 extends SBB._2[r16, rm16] {
    val opcode: OneOpcode = 0x1B /r
  }

  implicit object SBB_13 extends SBB._2[r32, rm32] {
    val opcode: OneOpcode = 0x1B /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object SBB_14 extends SBB._2[r64, rm64] {
    val opcode: OneOpcode = 0x1B /r
    override def prefix = REX.W(true)
  }

  implicit object SBB_15 extends SBB._1[imm8] {
    val opcode: OneOpcode = 0x1C
    override def hasImplicitOperand = true
  }

  implicit object SBB_16 extends SBB._1[imm16] {
    val opcode: OneOpcode = 0x1D
    override def hasImplicitOperand = true
  }

  implicit object SBB_17 extends SBB._1[imm32] {
    val opcode: OneOpcode = 0x1D
    override def hasImplicitOperand = true
  }
}
