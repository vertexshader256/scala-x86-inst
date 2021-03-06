package com.scalaAsm.x86
package Instructions
package x87

// Description: Square Root
// Category: general/arith

trait FSQRT extends InstructionDefinition {
  val mnemonic = "FSQRT"
}

object FSQRT extends ZeroOperands[FSQRT] with FSQRTImpl

trait FSQRTImpl extends FSQRT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
