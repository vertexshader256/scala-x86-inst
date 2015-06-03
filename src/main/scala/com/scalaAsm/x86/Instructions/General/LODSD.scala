package com.scalaAsm.x86
package Instructions
package General

// Description: Load String
// Category: general/datamovstring

trait LODSD extends InstructionDefinition {
  val mnemonic = "LODSD"
}

object LODSD extends ZeroOperands[LODSD] with LODSDImpl

trait LODSDImpl extends LODSD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAD
        override def hasImplicitOperand = true
  }
}
