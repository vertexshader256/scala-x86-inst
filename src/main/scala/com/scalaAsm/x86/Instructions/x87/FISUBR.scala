package com.scalaAsm.x86
package Instructions
package x87

// Description: Reverse Subtract
// Category: general/arith

trait FISUBR extends InstructionDefinition {
  val mnemonic = "FISUBR"
}

object FISUBR extends OneOperand[FISUBR] with FISUBRImpl

trait FISUBRImpl extends FISUBR {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
