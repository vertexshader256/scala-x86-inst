package com.scalaAsm.x86
package Instructions
package System

// Description: Load Task Register
// Category: general

trait LTR extends InstructionDefinition {
  val mnemonic = "LTR"
}

object LTR extends OneOperand[LTR] with LTRImpl

trait LTRImpl extends LTR {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
