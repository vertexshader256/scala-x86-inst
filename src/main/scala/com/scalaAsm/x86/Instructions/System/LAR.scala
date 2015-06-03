package com.scalaAsm.x86
package Instructions
package System

// Description: Load Access Rights Byte
// Category: general

trait LAR extends InstructionDefinition {
  val mnemonic = "LAR"
}

object LAR extends TwoOperands[LAR] with LARImpl

trait LARImpl extends LAR {
  implicit object _0 extends TwoOp[r16, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _3 extends TwoOp[r16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
  }

  implicit object _4 extends TwoOp[r32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[r64, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
