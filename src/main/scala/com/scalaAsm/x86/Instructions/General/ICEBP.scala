package com.scalaAsm.x86
package Instructions
package General

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait ICEBP extends InstructionDefinition {
  val mnemonic = "ICEBP"
}

object ICEBP extends ZeroOperands[ICEBP] with ICEBPImpl

trait ICEBPImpl extends ICEBP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xF1
        override def hasImplicitOperand = true
  }
}
