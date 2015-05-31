package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Rotate
// Category: general/shftrot

trait ROR extends InstructionDefinition {
  val mnemonic = "ROR"
}

object ROR extends OneOperand[ROR] with TwoOperands[ROR] with RORImpl

trait RORImpl extends ROR {
  implicit object ROR_0 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 1
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ROR_1 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 1
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ROR_2 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 1
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ROR_3 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 1
    override def prefix = REX.W(true)
    val explicitFormat = new RmImmFormat{}
  }

  implicit object ROR_4 extends _1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 1
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object ROR_5 extends _1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 1
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object ROR_6 extends _1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 1
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object ROR_7 extends _1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 1
    override def prefix = REX.W(true)
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
