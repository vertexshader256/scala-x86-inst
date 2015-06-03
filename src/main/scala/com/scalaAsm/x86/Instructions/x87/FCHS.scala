package com.scalaAsm.x86
package Instructions
package x87

// Description: Change Sign
// Category: general/arith

trait FCHS extends InstructionDefinition {
  val mnemonic = "FCHS"
}

object FCHS extends ZeroOperands[FCHS] with FCHSImpl

trait FCHSImpl extends FCHS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
