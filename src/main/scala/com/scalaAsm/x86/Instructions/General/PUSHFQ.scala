package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push rFLAGS Register onto the Stack
// Category: general/stackflgctrl

trait PUSHFQ extends InstructionDefinition {
  val mnemonic = "PUSHFQ"
}

object PUSHFQ extends ZeroOperands[PUSHFQ] with PUSHFQImpl

trait PUSHFQImpl extends PUSHFQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9C
        override def hasImplicitOperand = true
  }
}
