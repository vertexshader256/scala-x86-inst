package com.scalaAsm.x86
package Instructions
package x87

// Description: Add and Pop
// Category: general/arith

trait FADDP extends InstructionDefinition {
  val mnemonic = "FADDP"
}

object FADDP extends ZeroOperands[FADDP] with FADDPImpl

trait FADDPImpl extends FADDP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDE /+ 0
        override def hasImplicitOperand = true
  }
}
