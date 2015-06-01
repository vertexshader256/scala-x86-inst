package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Machine Status Word
// Category: general

trait SMSW extends InstructionDefinition {
  val mnemonic = "SMSW"
}

object SMSW extends OneOperand[SMSW] with SMSWImpl

trait SMSWImpl extends SMSW {
  implicit object _0 extends OneOp[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _3 extends OneOp[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    override def prefix = REX.W(true)
    val format = RegFormat
    override def hasImplicitOperand = true
  }
}
