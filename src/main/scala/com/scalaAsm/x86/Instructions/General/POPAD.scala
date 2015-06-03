package com.scalaAsm.x86
package Instructions
package General

// Description: Pop All General-Purpose Registers
// Category: general/stack

trait POPAD extends InstructionDefinition {
  val mnemonic = "POPAD"
}

object POPAD extends ZeroOperands[POPAD] with POPADImpl

trait POPADImpl extends POPAD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x61
        override def hasImplicitOperand = true
  }
}
