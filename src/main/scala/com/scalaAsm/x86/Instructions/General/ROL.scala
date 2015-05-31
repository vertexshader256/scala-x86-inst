package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Rotate
// Category: general/shftrot

trait ROL extends InstructionDefinition {
  val mnemonic = "ROL"
}

object ROL extends OneOperand[ROL] with TwoOperands[ROL] with ROLImpl

trait ROLImpl extends ROL {
  implicit object ROL_0 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 0
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object ROL_1 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 0
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object ROL_2 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 0
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object ROL_3 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 0
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object ROL_4 extends _1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object ROL_5 extends _1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object ROL_6 extends _1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object ROL_7 extends _1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 0
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
