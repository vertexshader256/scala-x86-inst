package com.scalaAsm.x86
package Instructions
package x87

// Description: Unordered Compare Floating Point Values and Pop
// Category: general/compar

trait FUCOMP extends InstructionDefinition {
  val mnemonic = "FUCOMP"
}

object FUCOMP extends ZeroOperands[FUCOMP] with FUCOMPImpl

trait FUCOMPImpl extends FUCOMP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDD /+ 5
        override def hasImplicitOperand = true
  }
}
