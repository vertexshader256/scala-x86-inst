package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Shift
// Category: general/shftrot

trait SAR extends InstructionDefinition {
  val mnemonic = "SAR"
}

object SAR extends OneOperand[SAR] with TwoOperands[SAR] with SARImpl

trait SARImpl extends SAR {
  implicit object SAR_0 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 7
  }

  implicit object SAR_1 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 7
  }

  implicit object SAR_2 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 7
  }

  implicit object SAR_3 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 7
    override def prefix = REX.W(true)
  }

  implicit object SAR_4 extends _1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 7
    override def hasImplicitOperand = true
  }

  implicit object SAR_5 extends _1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 7
    override def hasImplicitOperand = true
  }

  implicit object SAR_6 extends _1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 7
    override def hasImplicitOperand = true
  }

  implicit object SAR_7 extends _1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 7
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
