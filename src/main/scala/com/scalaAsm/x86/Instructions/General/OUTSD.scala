package com.scalaAsm.x86
package Instructions
package General

// Description: Output String to Port
// Category: general/inoutstring

trait OUTSD extends InstructionDefinition {
  val mnemonic = "OUTSD"
}

object OUTSD extends ZeroOperands[OUTSD] with OUTSDImpl

trait OUTSDImpl extends OUTSD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6F
        override def hasImplicitOperand = true
  }
}
