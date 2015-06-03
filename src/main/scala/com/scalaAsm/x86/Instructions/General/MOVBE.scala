package com.scalaAsm.x86
package Instructions
package General

// Description: Move Data After Swapping Bytes
// Category: general/datamov

trait MOVBE extends InstructionDefinition {
  val mnemonic = "MOVBE"
}

object MOVBE extends TwoOperands[MOVBE] with MOVBEImpl

trait MOVBEImpl extends MOVBE {
  implicit object _0 extends TwoOp[r16, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, m32] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, m64] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _3 extends TwoOp[m16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    val format = MemRegFormat
  }

  implicit object _4 extends TwoOp[m32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    val format = MemRegFormat
  }

  implicit object _5 extends TwoOp[m64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0x38) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }
}
