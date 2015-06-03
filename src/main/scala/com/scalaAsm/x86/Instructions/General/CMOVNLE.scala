package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/datamov

trait CMOVNLE extends InstructionDefinition {
  val mnemonic = "CMOVNLE"
}

object CMOVNLE extends TwoOperands[CMOVNLE] with CMOVNLEImpl

trait CMOVNLEImpl extends CMOVNLE {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
