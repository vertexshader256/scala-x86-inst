package com.scalaAsm.x86
package Instructions
package General

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVSB extends InstructionDefinition {
  val mnemonic = "MOVSB"
}

object MOVSB extends ZeroOperands[MOVSB] with MOVSBImpl

trait MOVSBImpl extends MOVSB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA4
        override def hasImplicitOperand = true
  }
}
