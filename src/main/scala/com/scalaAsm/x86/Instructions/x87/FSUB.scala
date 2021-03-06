package com.scalaAsm.x86
package Instructions
package x87

// Description: Subtract
// Category: general/arith

trait FSUB extends InstructionDefinition {
  val mnemonic = "FSUB"
}

object FSUB extends OneOperand[FSUB] with FSUBImpl

trait FSUBImpl extends FSUB {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD8 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDC /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
