package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Integer Subtraction with Borrow
// Category: general/arith/binary

trait SBB extends InstructionDefinition {
  val mnemonic = "SBB"
}

object SBB extends OneOperand[SBB] with TwoOperands[SBB] with SBBImpl

trait SBBLow extends SBB {
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: OneOpcode = 0x18 /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: OneOpcode = 0x19 /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: OneOpcode = 0x19 /r
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: OneOpcode = 0x19 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[r8, rm8] {
    val opcode: OneOpcode = 0x1A /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 3
    val format = RmImmFormat
  }

  implicit object _6 extends TwoOp[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 3
    val format = RmImmFormat
  }

  implicit object _7 extends TwoOp[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 3
    val format = RmImmFormat
  }

  implicit object _8 extends TwoOp[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 3
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object _9 extends TwoOp[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    val format = RmImmFormat
  }

  implicit object _10 extends TwoOp[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    val format = RmImmFormat
  }

  implicit object _11 extends TwoOp[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 3
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait SBBImpl extends SBBLow {
  implicit object _12 extends TwoOp[r16, rm16] {
    val opcode: OneOpcode = 0x1B /r
    val format = RegRmFormat
  }

  implicit object _13 extends TwoOp[r32, rm32] {
    val opcode: OneOpcode = 0x1B /r
    val format = RegRmFormat
  }

  implicit object _14 extends TwoOp[r64, rm64] {
    val opcode: OneOpcode = 0x1B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _15 extends OneOp[imm8] {
    val opcode: OneOpcode = 0x1C
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _16 extends OneOp[imm16] {
    val opcode: OneOpcode = 0x1D
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _17 extends OneOp[imm32] {
    val opcode: OneOpcode = 0x1D
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
