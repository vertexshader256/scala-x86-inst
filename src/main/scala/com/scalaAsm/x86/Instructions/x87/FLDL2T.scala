package com.scalaAsm.x86
package Instructions
package x87

// Description: Load Constant log210
// Category: general/ldconst

trait FLDL2T extends InstructionDefinition {
  val mnemonic = "FLDL2T"
}

object FLDL2T extends ZeroOperands[FLDL2T] with FLDL2TImpl

trait FLDL2TImpl extends FLDL2T {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
  }
}
