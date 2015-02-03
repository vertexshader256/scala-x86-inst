package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move
// Category: general/datamov

object MOV extends InstructionDefinition("MOV") with MOVImpl

trait MOVLow {
  implicit object MOV_0 extends MOV._2[rm8, r8] {
    val opcode: OneOpcode = 0x88 /r
  }

  implicit object MOV_1 extends MOV._2[rm16, r16] {
    val opcode: OneOpcode = 0x89 /r
  }

  implicit object MOV_2 extends MOV._2[rm32, r32] {
    val opcode: OneOpcode = 0x89 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object MOV_3 extends MOV._2[rm64, r64] {
    val opcode: OneOpcode = 0x89 /r
    override def prefix = REX.W(true)
  }

  implicit object MOV_4 extends MOV._2[r8, rm8] {
    val opcode: OneOpcode = 0x8A /r
  }

  implicit object MOV_5 extends MOV._2[Sreg, rm16] {
    val opcode: OneOpcode = 0x8E /r
  }

  implicit object MOV_6 extends MOV._2[rm8, imm8] {
    val opcode: OneOpcode = 0xC6 /+ 0
  }

  implicit object MOV_7 extends MOV._2[rm16, imm16] {
    val opcode: OneOpcode = 0xC7 /+ 0
  }

  implicit object MOV_8 extends MOV._2[rm32, imm32] {
    val opcode: OneOpcode = 0xC7 /+ 0
  }

  implicit object MOV_9 extends MOV._2[rm64, imm32] {
    val opcode: OneOpcode = 0xC7 /+ 0
    override def prefix = REX.W(true)
  }
}

trait MOVImpl extends MOVLow {
  implicit object MOV_10 extends MOV._2[r16, rm16] {
    val opcode: OneOpcode = 0x8B /r
  }

  implicit object MOV_11 extends MOV._2[r32, rm32] {
    val opcode: OneOpcode = 0x8B /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object MOV_12 extends MOV._2[r64, rm64] {
    val opcode: OneOpcode = 0x8B /r
    override def prefix = REX.W(true)
  }

  implicit object MOV_13 extends MOV._2[m16, Sreg] {
    val opcode: OneOpcode = 0x8C /r
  }

  implicit object MOV_14 extends MOV._2[r16, Sreg] {
    val opcode: OneOpcode = 0x8C /r
  }

  implicit object MOV_15 extends MOV._2[r32, Sreg] {
    val opcode: OneOpcode = 0x8C /r
  }

  implicit object MOV_16 extends MOV._2[r64, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    override def prefix = REX.W(true)
  }

  implicit object MOV_17 extends MOV._1[moffs8] {
    val opcode: OneOpcode = 0xA0
    override def hasImplicitOperand = true
  }

  implicit object MOV_18 extends MOV._1[moffs16] {
    val opcode: OneOpcode = 0xA1
    override def hasImplicitOperand = true
  }

  implicit object MOV_19 extends MOV._1[moffs32] {
    val opcode: OneOpcode = 0xA1
    override def hasImplicitOperand = true
  }

  implicit object MOV_20 extends MOV._1[moffs64] {
    val opcode: OneOpcode = 0xA1
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }

  implicit object MOV_21 extends MOV._2[r8, imm8] {
    val opcode: OneOpcode = 0xB0 + rb
  }

  implicit object MOV_22 extends MOV._2[r16, imm16] {
    val opcode: OneOpcode = 0xB8 + rw
  }

  implicit object MOV_23 extends MOV._2[r32, imm32] {
    val opcode: OneOpcode = 0xB8 + rd
  }

  implicit object MOV_24 extends MOV._2[r64, imm64] {
    val opcode: OneOpcode = 0xB8 + ro
    override def prefix = REX.W(true)
  }
}
