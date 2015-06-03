package com.scalaAsm.x86
package Instructions
package x87

// Description: Multiply and Pop
// Category: general/arith

trait FMULP extends InstructionDefinition {
  val mnemonic = "FMULP"
}

object FMULP extends ZeroOperands[FMULP] with FMULPImpl

trait FMULPImpl extends FMULP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDE /+ 1
        override def hasImplicitOperand = true
  }
}
