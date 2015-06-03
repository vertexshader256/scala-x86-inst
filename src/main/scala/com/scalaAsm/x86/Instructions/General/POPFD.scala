package com.scalaAsm.x86
package Instructions
package General

// Description: Pop Stack into eFLAGS Register
// Category: general/stackflgctrl

trait POPFD extends InstructionDefinition {
  val mnemonic = "POPFD"
}

object POPFD extends ZeroOperands[POPFD] with POPFDImpl

trait POPFDImpl extends POPFD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9D
        override def hasImplicitOperand = true
  }
}
