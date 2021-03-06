package com.scalaAsm.x86
package Instructions
package x87

// Description: Partial Remainder (for compatibility with i8087 and i287)
// Category: general/arith

trait FPREM extends InstructionDefinition {
  val mnemonic = "FPREM"
}

object FPREM extends ZeroOperands[FPREM] with FPREMImpl

trait FPREMImpl extends FPREM {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
