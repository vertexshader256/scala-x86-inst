package com.scalaAsm.x86
package Instructions
package General

// Description: Shift
// Category: general/shftrot

trait SHL extends InstructionDefinition {
  val mnemonic = "SHL"
}

object SHL extends OneOperand[SHL] with TwoOperands[SHL] with SHLImpl

trait SHLImpl extends SHL {
  implicit object _0 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 4
    val format = RmImmFormat
  }

  implicit object _1 extends TwoOp[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 4
    val format = RmImmFormat
  }

  implicit object _2 extends TwoOp[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 4
    val format = RmImmFormat
  }

  implicit object _3 extends TwoOp[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 4
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object _4 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _5 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _6 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _7 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 4
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
