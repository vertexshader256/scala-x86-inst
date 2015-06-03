package com.scalaAsm.x86
package Instructions
package General

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait INTO extends InstructionDefinition {
  val mnemonic = "INTO"
}

object INTO extends ZeroOperands[INTO] with INTOImpl

trait INTOImpl extends INTO {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xCE
        override def hasImplicitOperand = true
  }
}
