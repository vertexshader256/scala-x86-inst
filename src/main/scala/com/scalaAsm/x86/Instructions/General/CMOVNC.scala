package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - not below/above or equal/not carry (CF=0)
// Category: general/datamov

trait CMOVNC extends InstructionDefinition {
  val mnemonic = "CMOVNC"
}

object CMOVNC extends TwoOperands[CMOVNC] with CMOVNCImpl

trait CMOVNCImpl extends CMOVNC {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
