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
  implicit object _0 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xFF /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xFF /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xFF /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}

trait PUSHImpl extends PUSHLow {
  implicit object _3 extends NoOp{
    val opcode: OneOpcode = 0x06
        override def hasImplicitOperand = true
  }

  implicit object _4 extends OneOp[r16] {
    val opcode: OneOpcode = 0x50 + rw
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _5 extends OneOp[r32] {
    val opcode: OneOpcode = 0x50 + rd
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _6 extends OneOp[r64] {
    val opcode: OneOpcode = 0x50 + ro
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _7 extends OneOp[imm16] {
    val opcode: OneOpcode = 0x68
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _8 extends OneOp[imm32] {
    val opcode: OneOpcode = 0x68
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _9 extends OneOp[imm8] {
    val opcode: OneOpcode = 0x6A
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
