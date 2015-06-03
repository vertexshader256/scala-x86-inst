package com.scalaAsm.x86
package Instructions
package General

// Description: Bit Scan Reverse
// Category: general/bit

trait BSR extends InstructionDefinition {
  val mnemonic = "BSR"
}

object BSR extends TwoOperands[BSR] with BSRImpl

trait BSRImpl extends BSR {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBD) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xBD) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xBD) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
