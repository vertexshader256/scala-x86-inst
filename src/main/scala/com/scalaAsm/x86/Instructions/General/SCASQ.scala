package com.scalaAsm.x86
package Instructions
package General

// Description: Scan String
// Category: general/arithstring/binary

trait SCASQ extends InstructionDefinition {
  val mnemonic = "SCASQ"
}

object SCASQ extends ZeroOperands[SCASQ] with SCASQImpl

trait SCASQImpl extends SCASQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAF
        override def hasImplicitOperand = true
  }
}
