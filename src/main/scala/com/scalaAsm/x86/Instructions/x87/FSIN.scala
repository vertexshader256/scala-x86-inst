package com.scalaAsm.x86
package Instructions
package x87

// Description: Sine
// Category: general/trans

trait FSIN extends InstructionDefinition {
  val mnemonic = "FSIN"
}

object FSIN extends ZeroOperands[FSIN] with FSINImpl

trait FSINImpl extends FSIN {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
