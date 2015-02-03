package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read from Model Specific Register
// Category: general

object RDMSR extends InstructionDefinition("RDMSR") with RDMSRImpl

trait RDMSRImpl {
  implicit object RDMSR_0 extends RDMSR._0 {
    val opcode: TwoOpcodes = (0x0F, 0x32)
    override def hasImplicitOperand = true
  }
}
