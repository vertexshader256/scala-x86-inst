package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push FLAGS Register onto the Stack
// Category: general/stackflgctrl

trait PUSHF extends InstructionDefinition {
  val mnemonic = "PUSHF"
}

object PUSHF extends PUSHF with PUSHFImpl

trait PUSHFImpl {
  self: PUSHF =>
  implicit object PUSHF_0 extends _0 {
    val opcode: OneOpcode = 0x9C
    override def hasImplicitOperand = true
  }
}
