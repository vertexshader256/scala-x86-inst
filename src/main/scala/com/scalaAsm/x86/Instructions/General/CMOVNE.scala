package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - not zero/not equal (ZF=1)
// Category: general/datamov

trait CMOVNE extends InstructionDefinition {
  val mnemonic = "CMOVNE"
}

object CMOVNE extends TwoOperands[CMOVNE] with CMOVNEImpl

trait CMOVNEImpl extends CMOVNE {
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
