package com.scalaAsm.x86
package Instructions
package General

// Description: Pop Stack into FLAGS Register
// Category: general/stackflgctrl

trait POPF extends InstructionDefinition {
  val mnemonic = "POPF"
}

object POPF extends ZeroOperands[POPF] with POPFImpl

trait POPFImpl extends POPF {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9D
        override def hasImplicitOperand = true
  }
}
