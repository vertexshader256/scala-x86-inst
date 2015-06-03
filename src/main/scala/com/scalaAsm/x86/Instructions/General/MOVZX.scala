package com.scalaAsm.x86
package Instructions
package General

// Description: Move with Zero-Extend
// Category: general/conver

trait MOVZX extends InstructionDefinition {
  val mnemonic = "MOVZX"
}

object MOVZX extends TwoOperands[MOVZX] with MOVZXImpl

trait MOVZXLow extends MOVZX {
  implicit object _0 extends TwoOp[r16, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xB6) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xB6) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xB6) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _3 extends TwoOp[r32, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB7) /r
    val format = RegRmFormat
  }

  implicit object _4 extends TwoOp[r64, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB7) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}

trait MOVZXImpl extends MOVZXLow {
  implicit object _5 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB7) /r
    val format = RegRmFormat
  }
}
