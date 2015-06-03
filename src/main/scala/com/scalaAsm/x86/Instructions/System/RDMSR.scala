package com.scalaAsm.x86
package Instructions
package System

// Description: Read from Model Specific Register
// Category: general

trait RDMSR extends InstructionDefinition {
  val mnemonic = "RDMSR"
}

object RDMSR extends ZeroOperands[RDMSR] with RDMSRImpl

trait RDMSRImpl extends RDMSR {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x32)
        override def hasImplicitOperand = true
  }
}
