package com.scalaAsm.x86
package Instructions
package x87

// Description: Partial Tangent
// Category: general/trans

trait FPTAN extends InstructionDefinition {
  val mnemonic = "FPTAN"
}

object FPTAN extends ZeroOperands[FPTAN] with FPTANImpl

trait FPTANImpl extends FPTAN {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
  }
}
