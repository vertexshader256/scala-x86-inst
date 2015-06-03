package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - below/not above or equal/carry (CF=1)
// Category: general/datamov

trait CMOVC extends InstructionDefinition {
  val mnemonic = "CMOVC"
}

object CMOVC extends TwoOperands[CMOVC] with CMOVCImpl

trait CMOVCImpl extends CMOVC {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
