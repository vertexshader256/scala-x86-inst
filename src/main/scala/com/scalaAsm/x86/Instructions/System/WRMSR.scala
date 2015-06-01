package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Write to Model Specific Register
// Category: general

trait WRMSR extends InstructionDefinition {
  val mnemonic = "WRMSR"
}

object WRMSR extends ZeroOperands[WRMSR] with WRMSRImpl

trait WRMSRImpl extends WRMSR {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x30)
        override def hasImplicitOperand = true
  }
}
