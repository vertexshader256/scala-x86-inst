package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read from Model Specific Register
// Category: general

trait RDMSR extends InstructionDefinition {
  val mnemonic = "RDMSR"
}

object RDMSR extends RDMSR with ZeroOperands[RDMSR] with RDMSRImpl

trait RDMSRImpl {
  self: RDMSR =>
  implicit object RDMSR_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x32)
    override def hasImplicitOperand = true
  }
}
