package com.scalaAsm.x86
package Instructions
package General

// Description: Load String
// Category: general/datamovstring

trait LODSQ extends InstructionDefinition {
  val mnemonic = "LODSQ"
}

object LODSQ extends ZeroOperands[LODSQ] with LODSQImpl

trait LODSQImpl extends LODSQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAD
        override def hasImplicitOperand = true
  }
}
