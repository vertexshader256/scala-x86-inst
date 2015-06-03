package com.scalaAsm.x86
package Instructions
package General

// Description: Logical AND
// Category: general/logical

trait AND extends InstructionDefinition {
  val mnemonic = "AND"
}

object AND extends OneOperand[AND] with TwoOperands[AND] with ANDImpl

trait ANDLow extends AND {
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: OneOpcode = 0x20 /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: OneOpcode = 0x21 /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: OneOpcode = 0x21 /r
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: OneOpcode = 0x21 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[r8, rm8] {
    val opcode: OneOpcode = 0x22 /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 4
    val format = RmImmFormat
  }

  implicit object _6 extends TwoOp[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 4
    val format = RmImmFormat
  }

  implicit object _7 extends TwoOp[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 4
    val format = RmImmFormat
  }

  implicit object _8 extends TwoOp[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 4
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object _9 extends TwoOp[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 4
    val format = RmImmFormat
  }

  implicit object _10 extends TwoOp[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 4
    val format = RmImmFormat
  }

  implicit object _11 extends TwoOp[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 4
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait ANDImpl extends ANDLow {
  implicit object _12 extends TwoOp[r16, rm16] {
    val opcode: OneOpcode = 0x23 /r
    val format = RegRmFormat
  }

  implicit object _13 extends TwoOp[r32, rm32] {
    val opcode: OneOpcode = 0x23 /r
    val format = RegRmFormat
  }

  implicit object _14 extends TwoOp[r64, rm64] {
    val opcode: OneOpcode = 0x23 /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _15 extends OneOp[imm8] {
    val opcode: OneOpcode = 0x24
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _16 extends OneOp[imm16] {
    val opcode: OneOpcode = 0x25
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _17 extends OneOp[imm32] {
    val opcode: OneOpcode = 0x25
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
