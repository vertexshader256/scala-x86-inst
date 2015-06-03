package com.scalaAsm.x86
package Instructions
package x87

// Description: Sine and Cosine
// Category: general/trans

trait FSINCOS extends InstructionDefinition {
  val mnemonic = "FSINCOS"
}

object FSINCOS extends ZeroOperands[FSINCOS] with FSINCOSImpl

trait FSINCOSImpl extends FSINCOS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
