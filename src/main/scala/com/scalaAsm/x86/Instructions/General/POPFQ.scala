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

object POPFQ extends POPFQ with ZeroOperands[POPFQ] with POPFQImpl

trait POPFQImpl {
  self: POPFQ =>
  implicit object POPFQ_0 extends _0 {
    val opcode: OneOpcode = 0x9D
    override def hasImplicitOperand = true
  }
}
