package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - below or equal/not above (CF=1 AND ZF=1)
// Category: general/datamov

trait CMOVBE extends InstructionDefinition {
  val mnemonic = "CMOVBE"
}

object CMOVBE extends TwoOperands[CMOVBE] with CMOVBEImpl

trait CMOVBEImpl extends CMOVBE {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
