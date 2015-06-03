package com.scalaAsm.x86
package Instructions
package General

// Description: Scan String
// Category: general/arithstring/binary

trait SCASB extends InstructionDefinition {
  val mnemonic = "SCASB"
}

object SCASB extends ZeroOperands[SCASB] with SCASBImpl

trait SCASBImpl extends SCASB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAE
        override def hasImplicitOperand = true
  }
}
