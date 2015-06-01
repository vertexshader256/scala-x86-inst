package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - less/not greater (SF!=OF)
// Category: general/datamov

trait CMOVL extends InstructionDefinition {
  val mnemonic = "CMOVL"
}

object CMOVL extends TwoOperands[CMOVL] with CMOVLImpl

trait CMOVLImpl extends CMOVL {
  implicit object CMOVL_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    val format = RegRmFormat
  }

  implicit object CMOVL_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    val format = RegRmFormat
  }

  implicit object CMOVL_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
