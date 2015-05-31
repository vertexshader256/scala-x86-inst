package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Shift
// Category: general/shftrot

trait SHL extends InstructionDefinition {
  val mnemonic = "SHL"
}

object SHL extends OneOperand[SHL] with TwoOperands[SHL] with SHLImpl

trait SHLImpl extends SHL {
  implicit object SHL_0 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 4
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SHL_1 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 4
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SHL_2 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 4
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SHL_3 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 4
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object SHL_4 extends _1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SHL_5 extends _1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SHL_6 extends _1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SHL_7 extends _1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 4
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
