package com.scalaAsm.x86
package Instructions
package x87

// Description: Scale
// Category: general/arith

trait FSCALE extends InstructionDefinition {
  val mnemonic = "FSCALE"
}

object FSCALE extends ZeroOperands[FSCALE] with FSCALEImpl

trait FSCALEImpl extends FSCALE {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
