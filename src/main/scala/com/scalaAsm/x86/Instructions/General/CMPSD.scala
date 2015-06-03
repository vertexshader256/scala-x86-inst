package com.scalaAsm.x86
package Instructions
package General

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSD extends InstructionDefinition {
  val mnemonic = "CMPSD"
}

object CMPSD extends ZeroOperands[CMPSD] with CMPSDImpl

trait CMPSDImpl extends CMPSD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA7
        override def hasImplicitOperand = true
  }
}
