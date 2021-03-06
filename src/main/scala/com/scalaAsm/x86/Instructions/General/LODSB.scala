package com.scalaAsm.x86
package Instructions
package General

// Description: Load String
// Category: general/datamovstring

trait LODSB extends InstructionDefinition {
  val mnemonic = "LODSB"
}

object LODSB extends ZeroOperands[LODSB] with LODSBImpl

trait LODSBImpl extends LODSB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAC
        override def hasImplicitOperand = true
  }
}
