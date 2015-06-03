package com.scalaAsm.x86
package Instructions
package General

// Description: Pop All General-Purpose Registers
// Category: general/stack

trait POPA extends InstructionDefinition {
  val mnemonic = "POPA"
}

object POPA extends ZeroOperands[POPA] with POPAImpl

trait POPAImpl extends POPA {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x61
        override def hasImplicitOperand = true
  }
}
