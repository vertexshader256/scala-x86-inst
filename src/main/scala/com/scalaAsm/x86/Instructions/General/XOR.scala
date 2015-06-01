package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical Exclusive OR
// Category: general/logical

trait XOR extends InstructionDefinition {
  val mnemonic = "XOR"
}

object XOR extends OneOperand[XOR] with TwoOperands[XOR] with XORImpl

trait XORLow extends XOR {
  implicit object XOR_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x30 /r
    val format = MemRegFormat
  }

  implicit object XOR_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x31 /r
    val format = MemRegFormat
  }

  implicit object XOR_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x31 /r
    val format = MemRegFormat
  }

  implicit object XOR_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x31 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }

  implicit object XOR_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x32 /r
    val format = RegRmFormat
  }

  implicit object XOR_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 6
    val format = RmImmFormat
  }

  implicit object XOR_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 6
    val format = RmImmFormat
  }

  implicit object XOR_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 6
    val format = RmImmFormat
  }

  implicit object XOR_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 6
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }

  implicit object XOR_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 6
    val format = RmImmFormat
  }

  implicit object XOR_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 6
    val format = RmImmFormat
  }

  implicit object XOR_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 6
    override def prefix = REX.W(true)
    val format = RmImmFormat
  }
}

trait XORImpl extends XORLow {
  implicit object XOR_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x33 /r
    val format = RegRmFormat
  }

  implicit object XOR_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x33 /r
    val format = RegRmFormat
  }

  implicit object XOR_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x33 /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object XOR_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x34
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object XOR_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x35
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object XOR_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x35
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
