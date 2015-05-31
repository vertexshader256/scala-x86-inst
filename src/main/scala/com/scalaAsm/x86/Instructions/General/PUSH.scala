package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push Word, Doubleword or Quadword Onto the Stack
// Category: general/stacksegreg

trait PUSH extends InstructionDefinition {
  val mnemonic = "PUSH"
}

object PUSH extends ZeroOperands[PUSH] with OneOperand[PUSH] with PUSHImpl

trait PUSHLow extends PUSH {
  implicit object PUSH_0 extends _1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object PUSH_1 extends _1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object PUSH_2 extends _1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}

trait PUSHImpl extends PUSHLow {
  implicit object PUSH_3 extends _0 {
    val opcode: OneOpcode = 0x06
        override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object PUSH_4 extends _1[r16] {
    val opcode: OneOpcode = 0x50 + rw
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object PUSH_5 extends _1[r32] {
    val opcode: OneOpcode = 0x50 + rd
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object PUSH_6 extends _1[r64] {
    val opcode: OneOpcode = 0x50 + ro
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object PUSH_7 extends _1[imm16] {
    val opcode: OneOpcode = 0x68
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object PUSH_8 extends _1[imm32] {
    val opcode: OneOpcode = 0x68
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object PUSH_9 extends _1[imm8] {
    val opcode: OneOpcode = 0x6A
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
