package com.scalaAsm.x86
package Instructions
package x87

// Description: Reverse Subtract and Pop
// Category: general/arith

trait FSUBRP extends InstructionDefinition {
  val mnemonic = "FSUBRP"
}

object FSUBRP extends ZeroOperands[FSUBRP] with FSUBRPImpl

trait FSUBRPImpl extends FSUBRP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDE /+ 4
        override def hasImplicitOperand = true
  }
}
