package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop Stack into FLAGS Register
// Category: general/stackflgctrl

trait POPF extends InstructionDefinition {
  val mnemonic = "POPF"
}

object POPF extends POPF with ZeroOperands[POPF] with POPFImpl

trait POPFImpl {
  self: POPF =>
  implicit object POPF_0 extends _0 {
    val opcode: OneOpcode = 0x9D
    override def hasImplicitOperand = true
  }
}
