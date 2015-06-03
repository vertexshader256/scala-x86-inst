package com.scalaAsm.x86
package Instructions
package x87

// Description: Load Constant π
// Category: general/ldconst

trait FLDPI extends InstructionDefinition {
  val mnemonic = "FLDPI"
}

object FLDPI extends ZeroOperands[FLDPI] with FLDPIImpl

trait FLDPIImpl extends FLDPI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
  }
}
