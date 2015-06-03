package com.scalaAsm.x86
package Instructions
package General

// Description: Byte Swap
// Category: general/datamov

trait BSWAP extends InstructionDefinition {
  val mnemonic = "BSWAP"
}

object BSWAP extends OneOperand[BSWAP] with BSWAPImpl

trait BSWAPImpl extends BSWAP {
  implicit object _0 extends OneOp[r16] {
    val opcode: TwoOpcodes = (0x0F, 0xC8) + rw
    val format = RegFormat
  }

  implicit object _1 extends OneOp[r32] {
    val opcode: TwoOpcodes = (0x0F, 0xC8) + rd
    val format = RegFormat
  }

  implicit object _2 extends OneOp[r64] {
    val opcode: TwoOpcodes = (0x0F, 0xC8) + ro
    override def prefix = REX.W(true)
    val format = RegFormat
  }
}
