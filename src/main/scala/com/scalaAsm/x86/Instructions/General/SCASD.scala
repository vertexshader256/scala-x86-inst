package com.scalaAsm.x86
package Instructions
package General

// Description: Scan String
// Category: general/arithstring/binary

trait SCASD extends InstructionDefinition {
  val mnemonic = "SCASD"
}

object SCASD extends ZeroOperands[SCASD] with SCASDImpl

trait SCASDImpl extends SCASD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAF
        override def hasImplicitOperand = true
  }
}
