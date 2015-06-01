package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVSQ extends InstructionDefinition {
  val mnemonic = "MOVSQ"
}

object MOVSQ extends ZeroOperands[MOVSQ] with MOVSQImpl

trait MOVSQImpl extends MOVSQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA5
        override def hasImplicitOperand = true
  }
}
