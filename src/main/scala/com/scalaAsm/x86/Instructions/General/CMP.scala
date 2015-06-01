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
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: OneOpcode = 0x38 /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: OneOpcode = 0x39 /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: OneOpcode = 0x39 /r
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: OneOpcode = 0x39 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[r8, rm8] {
    val opcode: OneOpcode = 0x3A /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 7
    val format = RmImmFormat
  }

  implicit object _6 extends TwoOp[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 7
    val format = RmImmFormat
  }

  implicit object _7 extends TwoOp[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 7
    val format = RmImmFormat
  }

  implicit object _8 extends TwoOp[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 7
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object _9 extends TwoOp[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    val format = RmImmFormat
  }

  implicit object _10 extends TwoOp[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    val format = RmImmFormat
  }

  implicit object _11 extends TwoOp[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 7
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait CMPImpl extends CMPLow {
  implicit object _12 extends TwoOp[r16, rm16] {
    val opcode: OneOpcode = 0x3B /r
    val format = RegRmFormat
  }

  implicit object _13 extends TwoOp[r32, rm32] {
    val opcode: OneOpcode = 0x3B /r
    val format = RegRmFormat
  }

  implicit object _14 extends TwoOp[r64, rm64] {
    val opcode: OneOpcode = 0x3B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _15 extends OneOp[imm8] {
    val opcode: OneOpcode = 0x3C
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _16 extends OneOp[imm16] {
    val opcode: OneOpcode = 0x3D
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _17 extends OneOp[imm32] {
    val opcode: OneOpcode = 0x3D
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
