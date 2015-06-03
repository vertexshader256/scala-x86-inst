package com.scalaAsm.x86
package Instructions
package General

// Description: Bit Scan Forward
// Category: general/bit

trait BSF extends InstructionDefinition {
  val mnemonic = "BSF"
}

object BSF extends TwoOperands[BSF] with BSFImpl

trait BSFImpl extends BSF {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBC) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xBC) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xBC) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
