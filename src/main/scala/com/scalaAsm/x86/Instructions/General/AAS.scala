package com.scalaAsm.x86
package Instructions
package General

// Description: ASCII Adjust AL After Subtraction
// Category: general/arith/decimal

trait AAS extends InstructionDefinition {
  val mnemonic = "AAS"
}

object AAS extends ZeroOperands[AAS] with AASImpl

trait AASImpl extends AAS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x3F
        override def hasImplicitOperand = true
  }
}
