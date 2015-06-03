package com.scalaAsm.x86
package Instructions
package General

// Description: Compare and Exchange
// Category: general/datamovarith/binary

trait CMPXCHG extends InstructionDefinition {
  val mnemonic = "CMPXCHG"
}

object CMPXCHG extends TwoOperands[CMPXCHG] with CMPXCHGImpl

trait CMPXCHGImpl extends CMPXCHG {
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: TwoOpcodes = (0x0F, 0xB0) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xB1) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xB1) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xB1) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }
}
