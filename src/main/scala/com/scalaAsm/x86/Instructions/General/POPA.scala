package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop All General-Purpose Registers
// Category: general/stack

trait POPA extends InstructionDefinition {
  val mnemonic = "POPA"
}

object POPA extends ZeroOperands[POPA] with POPAImpl

trait POPAImpl extends POPA {
  implicit object POPA_0 extends _0 {
    val opcode: OneOpcode = 0x61
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
