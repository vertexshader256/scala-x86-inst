package com.scalaAsm.x86
package Instructions
package General

// Description: Rotate
// Category: general/shftrot

trait RCR extends InstructionDefinition {
  val mnemonic = "RCR"
}

object RCR extends OneOperand[RCR] with TwoOperands[RCR] with RCRImpl

trait RCRImpl extends RCR {
  implicit object _0 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 3
    val format = RmImmFormat
  }

  implicit object _1 extends TwoOp[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 3
    val format = RmImmFormat
  }

  implicit object _2 extends TwoOp[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 3
    val format = RmImmFormat
  }

  implicit object _3 extends TwoOp[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 3
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object _4 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _5 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _6 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _7 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 3
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
