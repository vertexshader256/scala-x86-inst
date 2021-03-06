package com.scalaAsm.x86
package Instructions
package x87

// Description: Load Constant +0.0
// Category: general/ldconst

trait FLDZ extends InstructionDefinition {
  val mnemonic = "FLDZ"
}

object FLDZ extends ZeroOperands[FLDZ] with FLDZImpl

trait FLDZImpl extends FLDZ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
  }
}
