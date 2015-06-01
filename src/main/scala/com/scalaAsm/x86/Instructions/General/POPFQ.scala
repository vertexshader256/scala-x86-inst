package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop Stack into rFLAGS Register
// Category: general/stackflgctrl

trait POPFQ extends InstructionDefinition {
  val mnemonic = "POPFQ"
}

object POPFQ extends ZeroOperands[POPFQ] with POPFQImpl

trait POPFQImpl extends POPFQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9D
        override def hasImplicitOperand = true
  }
}
