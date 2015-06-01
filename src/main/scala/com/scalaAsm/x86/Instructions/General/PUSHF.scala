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

object PUSHF extends ZeroOperands[PUSHF] with PUSHFImpl

trait PUSHFImpl extends PUSHF {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9C
        override def hasImplicitOperand = true
  }
}
