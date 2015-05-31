package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Subtract
// Category: general/arith/binary

trait SUB extends InstructionDefinition {
  val mnemonic = "SUB"
}

object SUB extends OneOperand[SUB] with TwoOperands[SUB] with SUBImpl

trait SUBLow extends SUB {
  implicit object SUB_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x28 /r
    val explicitFormat = new MemRegFormat{}
  }

  implicit object SUB_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x29 /r
    val explicitFormat = new MemRegFormat{}
  }

  implicit object SUB_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x29 /r
    val explicitFormat = new MemRegFormat{}
  }

  implicit object SUB_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x29 /r
    override def prefix = REX.W(true)
    val explicitFormat = new MemRegFormat{}
  }

  implicit object SUB_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x2A /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object SUB_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 5
    val explicitFormat = new RmImmFormat{}
  }

  implicit object SUB_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 5
    val explicitFormat = new RmImmFormat{}
  }

  implicit object SUB_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 5
    val explicitFormat = new RmImmFormat{}
  }

  implicit object SUB_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 5
    override def prefix = REX.W(true)
    val explicitFormat = new RmImmFormat{}
  }

  implicit object SUB_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 5
    val explicitFormat = new RmImmFormat{}
  }

  implicit object SUB_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 5
    val explicitFormat = new RmImmFormat{}
  }

  implicit object SUB_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 5
    override def prefix = REX.W(true)
    val explicitFormat = new RmImmFormat{}
  }
}

trait SUBImpl extends SUBLow {
  implicit object SUB_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x2B /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object SUB_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x2B /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object SUB_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x2B /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }

  implicit object SUB_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x2C
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object SUB_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x2D
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object SUB_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x2D
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }
}
