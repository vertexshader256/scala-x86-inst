package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add
// Category: general/arith/binary

trait ADD extends InstructionDefinition {
  val mnemonic = "ADD"
}

object ADD extends OneOperand[ADD] with TwoOperands[ADD] with ADDImpl

trait ADDLow extends ADD {
  implicit object ADD_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x00 /r
    val explicitFormat = new MemRegFormat{}
  }

  implicit object ADD_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x01 /r
    val explicitFormat = new MemRegFormat{}
  }

  implicit object ADD_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x01 /r
    val explicitFormat = new MemRegFormat{}
  }

  implicit object ADD_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x01 /r
    override def prefix = REX.W(true)
    val explicitFormat = new MemRegFormat{}
  }

  implicit object ADD_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x02 /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object ADD_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 0
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ADD_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 0
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ADD_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 0
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ADD_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 0
    override def prefix = REX.W(true)
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ADD_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 0
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ADD_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 0
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ADD_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 0
    override def prefix = REX.W(true)
    val explicitFormat = new RmImmFormat{}
  }
}

trait ADDImpl extends ADDLow {
  implicit object ADD_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x03 /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object ADD_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x03 /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object ADD_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x03 /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }

  implicit object ADD_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x04
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object ADD_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x05
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object ADD_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x05
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }
}
