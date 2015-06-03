package com.scalaAsm.x86
package Instructions
package General

// Description: Load String
// Category: general/datamovstring

trait LODS extends InstructionDefinition {
  val mnemonic = "LODS"
}

object LODS extends ZeroOperands[LODS] with LODSImpl

trait LODSImpl extends LODS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAC
        override def hasImplicitOperand = true
  }
}
