package com.scalaAsm.x86
package Instructions
package x87

// Description: Partial Arctangent and Pop
// Category: general/trans

trait FPATAN extends InstructionDefinition {
  val mnemonic = "FPATAN"
}

object FPATAN extends ZeroOperands[FPATAN] with FPATANImpl

trait FPATANImpl extends FPATAN {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
  }
}
