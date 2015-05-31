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
  implicit object PUSHFQ_0 extends _0 {
    val opcode: OneOpcode = 0x9C
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
