package com.scalaAsm.x86
package Instructions
package System

// Description: Store Local Descriptor Table Register
// Category: general

trait SLDT extends InstructionDefinition {
  val mnemonic = "SLDT"
}

object SLDT extends OneOperand[SLDT] with SLDTImpl

trait SLDTImpl extends SLDT {
  implicit object _0 extends OneOp[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _3 extends OneOp[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def prefix = REX.W(true)
    val format = RegFormat
    override def hasImplicitOperand = true
  }
}
