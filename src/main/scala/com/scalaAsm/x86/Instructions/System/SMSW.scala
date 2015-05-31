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
  implicit object SMSW_0 extends _1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SMSW_1 extends _1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SMSW_2 extends _1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SMSW_3 extends _1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    override def prefix = REX.W(true)
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
