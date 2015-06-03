package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - not less/greater or equal (SF=OF)
// Category: general/datamov

trait CMOVNL extends InstructionDefinition {
  val mnemonic = "CMOVNL"
}

object CMOVNL extends TwoOperands[CMOVNL] with CMOVNLImpl

trait CMOVNLImpl extends CMOVNL {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
