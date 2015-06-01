package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVSD extends InstructionDefinition {
  val mnemonic = "MOVSD"
}

object MOVSD extends ZeroOperands[MOVSD] with MOVSDImpl

trait MOVSDImpl extends MOVSD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA5
        override def hasImplicitOperand = true
  }
}
