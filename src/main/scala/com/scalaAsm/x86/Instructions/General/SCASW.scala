package com.scalaAsm.x86
package Instructions
package General

// Description: Scan String
// Category: general/arithstring/binary

trait SCASW extends InstructionDefinition {
  val mnemonic = "SCASW"
}

object SCASW extends ZeroOperands[SCASW] with SCASWImpl

trait SCASWImpl extends SCASW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAF
        override def hasImplicitOperand = true
  }
}
