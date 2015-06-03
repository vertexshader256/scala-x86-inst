package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - less/not greater (SF!=OF)
// Category: general/datamov

trait CMOVL extends InstructionDefinition {
  val mnemonic = "CMOVL"
}

object CMOVL extends TwoOperands[CMOVL] with CMOVLImpl

trait CMOVLImpl extends CMOVL {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
