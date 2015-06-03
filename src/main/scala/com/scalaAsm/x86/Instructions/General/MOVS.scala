package com.scalaAsm.x86
package Instructions
package General

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVS extends InstructionDefinition {
  val mnemonic = "MOVS"
}

object MOVS extends ZeroOperands[MOVS] with MOVSImpl

trait MOVSImpl extends MOVS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA4
        override def hasImplicitOperand = true
  }
}
