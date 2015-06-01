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
  implicit object MOV_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x88 /r
    val format = MemRegFormat
  }

  implicit object MOV_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x89 /r
    val format = MemRegFormat
  }

  implicit object MOV_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x89 /r
    val format = MemRegFormat
  }

  implicit object MOV_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x89 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object MOV_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x8A /r
    val format = RegRmFormat
  }

  implicit object MOV_5 extends _2[Sreg, rm16] {
    val opcode: OneOpcode = 0x8E /r
    val format = RegRmFormat
  }

  implicit object MOV_6 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC6 /+ 0
    val format = RmImmFormat
  }

  implicit object MOV_7 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0xC7 /+ 0
    val format = RmImmFormat
  }

  implicit object MOV_8 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0xC7 /+ 0
    val format = RmImmFormat
  }

  implicit object MOV_9 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0xC7 /+ 0
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait MOVImpl extends MOVLow {
  implicit object MOV_10 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x8B /r
    val format = RegRmFormat
  }

  implicit object MOV_11 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x8B /r
    val format = RegRmFormat
  }

  implicit object MOV_12 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x8B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object MOV_13 extends _2[m16, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    val format = MemRegFormat
  }

  implicit object MOV_14 extends _2[r16, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    val format = MemRegFormat
  }

  implicit object MOV_15 extends _2[r32, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    val format = MemRegFormat
  }

  implicit object MOV_16 extends _2[r64, Sreg] {
    val opcode: OneOpcode = 0x8C /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object MOV_17 extends _1[moffs8] {
    val opcode: OneOpcode = 0xA0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object MOV_18 extends _1[moffs16] {
    val opcode: OneOpcode = 0xA1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object MOV_19 extends _1[moffs32] {
    val opcode: OneOpcode = 0xA1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object MOV_20 extends _1[moffs64] {
    val opcode: OneOpcode = 0xA1
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object MOV_21 extends _2[r8, imm8] {
    val opcode: OneOpcode = 0xB0 + rb
    val format = RmImmFormat
  }

  implicit object MOV_22 extends _2[r16, imm16] {
    val opcode: OneOpcode = 0xB8 + rw
    val format = RmImmFormat
  }

  implicit object MOV_23 extends _2[r32, imm32] {
    val opcode: OneOpcode = 0xB8 + rd
    val format = RmImmFormat
  }

  implicit object MOV_24 extends _2[r64, imm64] {
    val opcode: OneOpcode = 0xB8 + ro
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}
