package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add
// Category: general/arith/binary

object ADD extends InstructionDefinition("ADD") with ADDImpl

trait ADDLow {
  implicit object ADD_0 extends ADD._2[rm8, r8] {
    val opcode: OneOpcode = 0x00 /r
  }

  implicit object ADD_1 extends ADD._2[rm16, r16] {
    val opcode: OneOpcode = 0x01 /r
  }

  implicit object ADD_2 extends ADD._2[rm32, r32] {
    val opcode: OneOpcode = 0x01 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object ADD_3 extends ADD._2[rm64, r64] {
    val opcode: OneOpcode = 0x01 /r
    override def prefix = REX.W(true)
  }

  implicit object ADD_4 extends ADD._2[r8, rm8] {
    val opcode: OneOpcode = 0x02 /r
  }

  implicit object ADD_5 extends ADD._2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 0
  }

  implicit object ADD_6 extends ADD._2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 0
  }

  implicit object ADD_7 extends ADD._2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 0
  }

  implicit object ADD_8 extends ADD._2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 0
    override def prefix = REX.W(true)
  }

  implicit object ADD_9 extends ADD._2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 0
  }

  implicit object ADD_10 extends ADD._2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 0
  }

  implicit object ADD_11 extends ADD._2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 0
    override def prefix = REX.W(true)
  }
}

trait ADDImpl extends ADDLow {
  implicit object ADD_12 extends ADD._2[r16, rm16] {
    val opcode: OneOpcode = 0x03 /r
  }

  implicit object ADD_13 extends ADD._2[r32, rm32] {
    val opcode: OneOpcode = 0x03 /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object ADD_14 extends ADD._2[r64, rm64] {
    val opcode: OneOpcode = 0x03 /r
    override def prefix = REX.W(true)
  }

  implicit object ADD_15 extends ADD._1[imm8] {
    val opcode: OneOpcode = 0x04
    override def hasImplicitOperand = true
  }

  implicit object ADD_16 extends ADD._1[imm16] {
    val opcode: OneOpcode = 0x05
    override def hasImplicitOperand = true
  }

  implicit object ADD_17 extends ADD._1[imm32] {
    val opcode: OneOpcode = 0x05
    override def hasImplicitOperand = true
  }
}
