package com.scalaAsm.x86
package Instructions
package x87

// Description: Extract Exponent and Significand
// Category: general/arith

trait FXTRACT extends InstructionDefinition {
  val mnemonic = "FXTRACT"
}

object FXTRACT extends ZeroOperands[FXTRACT] with FXTRACTImpl

trait FXTRACTImpl extends FXTRACT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
  }
}
