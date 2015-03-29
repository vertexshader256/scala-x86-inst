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

object WRMSR extends WRMSR with WRMSRImpl

trait WRMSRImpl {
  self: WRMSR =>
  implicit object WRMSR_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x30)
    override def hasImplicitOperand = true
  }
}
