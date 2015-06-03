package com.scalaAsm.x86
package Instructions
package General

// Description: Double Precision Shift Right
// Category: general/shftrot

trait SHRD extends InstructionDefinition {
  val mnemonic = "SHRD"
}

object SHRD extends TwoOperands[SHRD] with SHRDImpl

trait SHRDImpl extends SHRD {
  implicit object _0 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xAD) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xAD) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xAD) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }
}
