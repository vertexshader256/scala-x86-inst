package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store String
// Category: general/datamovstring

trait STOSD extends InstructionDefinition {
  val mnemonic = "STOSD"
}

object STOSD extends ZeroOperands[STOSD] with STOSDImpl

trait STOSDImpl extends STOSD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAB
        override def hasImplicitOperand = true
  }
}
