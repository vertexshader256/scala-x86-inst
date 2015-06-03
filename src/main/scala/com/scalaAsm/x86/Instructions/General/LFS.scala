package com.scalaAsm.x86
package Instructions
package General

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LFS extends InstructionDefinition {
  val mnemonic = "LFS"
}

object LFS extends TwoOperands[LFS] with LFSImpl

trait LFSImpl extends LFS {
  implicit object _0 extends TwoOp[r16, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB4) /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[r32, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB4) /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends TwoOp[r64, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB4) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }
}
