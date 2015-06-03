package com.scalaAsm.x86
package Instructions
package General

// Description: Input from Port to String
// Category: general/inoutstring

trait INSB extends InstructionDefinition {
  val mnemonic = "INSB"
}

object INSB extends ZeroOperands[INSB] with INSBImpl

trait INSBImpl extends INSB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6C
        override def hasImplicitOperand = true
  }
}
