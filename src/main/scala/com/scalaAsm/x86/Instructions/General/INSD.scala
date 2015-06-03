package com.scalaAsm.x86
package Instructions
package General

// Description: Input from Port to String
// Category: general/inoutstring

trait INSD extends InstructionDefinition {
  val mnemonic = "INSD"
}

object INSD extends ZeroOperands[INSD] with INSDImpl

trait INSDImpl extends INSD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6D
        override def hasImplicitOperand = true
  }
}
