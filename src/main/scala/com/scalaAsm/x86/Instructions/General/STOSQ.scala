package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store String
// Category: general/datamovstring

trait STOSQ extends InstructionDefinition {
  val mnemonic = "STOSQ"
}

object STOSQ extends ZeroOperands[STOSQ] with STOSQImpl

trait STOSQImpl extends STOSQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAB
        override def hasImplicitOperand = true
  }
}
