package com.scalaAsm.x86
package Instructions
package x87

// Description: Divide
// Category: general/arith

trait FIDIV extends InstructionDefinition {
  val mnemonic = "FIDIV"
}

object FIDIV extends OneOperand[FIDIV] with FIDIVImpl

trait FIDIVImpl extends FIDIV {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
