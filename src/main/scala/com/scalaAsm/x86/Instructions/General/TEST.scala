package com.scalaAsm.x86
package Instructions
package General

// Description: Logical Compare
// Category: general/arith/binary

trait TEST extends InstructionDefinition {
  val mnemonic = "TEST"
}

object TEST extends OneOperand[TEST] with TwoOperands[TEST] with TESTImpl

trait TESTLow extends TEST {
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: OneOpcode = 0x84 /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: OneOpcode = 0x85 /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: OneOpcode = 0x85 /r
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: OneOpcode = 0x85 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0xF6 /+ 0
    val format = RmImmFormat
  }

  implicit object _5 extends TwoOp[rm16, imm16] {
    val opcode: OneOpcode = 0xF7 /+ 0
    val format = RmImmFormat
  }

  implicit object _6 extends TwoOp[rm32, imm32] {
    val opcode: OneOpcode = 0xF7 /+ 0
    val format = RmImmFormat
  }

  implicit object _7 extends TwoOp[rm64, imm64] {
    val opcode: OneOpcode = 0xF7 /+ 0
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait TESTImpl extends TESTLow {
  implicit object _8 extends OneOp[imm8] {
    val opcode: OneOpcode = 0xA8
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _9 extends OneOp[imm16] {
    val opcode: OneOpcode = 0xA9
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _10 extends OneOp[imm32] {
    val opcode: OneOpcode = 0xA9
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
