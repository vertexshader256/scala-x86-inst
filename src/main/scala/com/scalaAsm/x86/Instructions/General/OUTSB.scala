package com.scalaAsm.x86
package Instructions
package General

// Description: Output String to Port
// Category: general/inoutstring

trait OUTSB extends InstructionDefinition {
  val mnemonic = "OUTSB"
}

object OUTSB extends ZeroOperands[OUTSB] with OUTSBImpl

trait OUTSBImpl extends OUTSB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6E
        override def hasImplicitOperand = true
  }
}
