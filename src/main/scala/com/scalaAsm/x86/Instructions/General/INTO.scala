package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait INTO extends InstructionDefinition {
  val mnemonic = "INTO"
}

object INTO extends INTO with INTOImpl

trait INTOImpl {
  self: INTO =>
  implicit object INTO_0 extends _0 {
    val opcode: OneOpcode = 0xCE
    override def hasImplicitOperand = true
  }
}
