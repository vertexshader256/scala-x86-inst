package com.scalaAsm.x86
package Instructions
package General

// Description: Store String
// Category: general/datamovstring

trait STOSB extends InstructionDefinition {
  val mnemonic = "STOSB"
}

object STOSB extends ZeroOperands[STOSB] with STOSBImpl

trait STOSBImpl extends STOSB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAA
        override def hasImplicitOperand = true
  }
}
