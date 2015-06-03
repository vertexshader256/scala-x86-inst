package com.scalaAsm.x86
package Instructions
package x87

// Description: Reverse Subtract
// Category: general/arith

trait FSUBR extends InstructionDefinition {
  val mnemonic = "FSUBR"
}

object FSUBR extends OneOperand[FSUBR] with FSUBRImpl

trait FSUBRImpl extends FSUBR {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD8 /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDC /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
