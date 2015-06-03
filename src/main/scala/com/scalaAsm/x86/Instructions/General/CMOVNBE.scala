package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - not below or equal/above (CF=0 AND ZF=0)
// Category: general/datamov

trait CMOVNBE extends InstructionDefinition {
  val mnemonic = "CMOVNBE"
}

object CMOVNBE extends TwoOperands[CMOVNBE] with CMOVNBEImpl

trait CMOVNBEImpl extends CMOVNBE {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
