package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - not zero/not equal (ZF=1)
// Category: general/datamov

trait CMOVNZ extends InstructionDefinition {
  val mnemonic = "CMOVNZ"
}

object CMOVNZ extends TwoOperands[CMOVNZ] with CMOVNZImpl

trait CMOVNZImpl extends CMOVNZ {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
