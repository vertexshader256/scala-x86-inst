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
  implicit object MOVSD_0 extends _0 {
    val opcode: OneOpcode = 0xA5
        override def hasImplicitOperand = true
  }
}
