package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move
// Category: general/datamov

trait MOV extends InstructionDefinition {
  val mnemonic = "MOV"
}

object MOV extends OneOperand[MOV] with TwoOperands[MOV] with MOVImpl

trait MOVLow extends MOV {
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: OneOpcode = 0x88 /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: OneOpcode = 0x89 /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: OneOpcode = 0x89 /r
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: OneOpcode = 0x89 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[r8, rm8] {
    val opcode: OneOpcode = 0x8A /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[Sreg, rm16] {
    val opcode: OneOpcode = 0x8E /r
    val format = RegRmFormat
  }

  implicit object _6 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0xC6 /+ 0
    val format = RmImmFormat
  }

  implicit object _7 extends TwoOp[rm16, imm16] {
    val opcode: OneOpcode = 0xC7 /+ 0
    val format = RmImmFormat
  }

  implicit object _8 extends TwoOp[rm32, imm32] {
    val opcode: OneOpcode = 0xC7 /+ 0
    val format = RmImmFormat
  }

  implicit object _9 extends TwoOp[rm64, imm32] {
    val opcode: OneOpcode = 0xC7 /+ 0
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait MOVImpl extends MOVLow {
  implicit object _10 extends TwoOp[r16, rm16] {
    val opcode: OneOpcode = 0x8B /r
    val format = RegRmFormat
  }

  implicit object _11 extends TwoOp[r32, rm32] {
    val opcode: OneOpcode = 0x8B /r
    val format = RegRmFormat
  }

  implicit object _12 extends TwoOp[r64, rm64] {
    val opcode: OneOpcode = 0x8B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _13 extends TwoOp[m16, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    val format = MemRegFormat
  }

  implicit object _14 extends TwoOp[r16, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    val format = MemRegFormat
  }

  implicit object _15 extends TwoOp[r32, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    val format = MemRegFormat
  }

  implicit object _16 extends TwoOp[r64, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _17 extends OneOp[moffs8] {
    val opcode: OneOpcode = 0xA0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _18 extends OneOp[moffs16] {
    val opcode: OneOpcode = 0xA1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _19 extends OneOp[moffs32] {
    val opcode: OneOpcode = 0xA1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _20 extends OneOp[moffs64] {
    val opcode: OneOpcode = 0xA1
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _21 extends TwoOp[r8, imm8] {
    val opcode: OneOpcode = 0xB0 + rb
    val format = RmImmFormat
  }

  implicit object _22 extends TwoOp[r16, imm16] {
    val opcode: OneOpcode = 0xB8 + rw
    val format = RmImmFormat
  }

  implicit object _23 extends TwoOp[r32, imm32] {
    val opcode: OneOpcode = 0xB8 + rd
    val format = RmImmFormat
  }

  implicit object _24 extends TwoOp[r64, imm64] {
    val opcode: OneOpcode = 0xB8 + ro
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}
