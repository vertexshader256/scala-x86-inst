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

object SMSW extends SMSW with SMSWImpl

trait SMSWImpl {
  self: SMSW =>
  implicit object SMSW_0 extends _1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    override def hasImplicitOperand = true
  }

  implicit object SMSW_1 extends _1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    override def hasImplicitOperand = true
  }

  implicit object SMSW_2 extends _1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    override def hasImplicitOperand = true
  }

  implicit object SMSW_3 extends _1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 4
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
