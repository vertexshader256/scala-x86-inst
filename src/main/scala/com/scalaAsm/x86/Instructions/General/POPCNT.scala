package com.scalaAsm.x86
package Instructions
package General

// Description: Bit Population Count
// Category: general/bit

trait POPCNT extends InstructionDefinition {
  val mnemonic = "POPCNT"
}

object POPCNT extends TwoOperands[POPCNT] with POPCNTImpl

trait POPCNTImpl extends POPCNT {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB8) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xB8) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xB8) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
