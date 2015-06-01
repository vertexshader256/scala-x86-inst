package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Rotate
// Category: general/shftrot

trait RCR extends InstructionDefinition {
  val mnemonic = "RCR"
}

object RCR extends OneOperand[RCR] with TwoOperands[RCR] with RCRImpl

trait RCRImpl extends RCR {
  implicit object RCR_0 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 3
    val format = RmImmFormat
  }

  implicit object RCR_1 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 3
    val format = RmImmFormat
  }

  implicit object RCR_2 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 3
    val format = RmImmFormat
  }

  implicit object RCR_3 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 3
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object RCR_4 extends _1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object RCR_5 extends _1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object RCR_6 extends _1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object RCR_7 extends _1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 3
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
