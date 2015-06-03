package com.scalaAsm.x86
package Instructions
package x87

// Description: Compare Real
// Category: general/compar

trait FCOM extends InstructionDefinition {
  val mnemonic = "FCOM"
}

object FCOM extends ZeroOperands[FCOM] with OneOperand[FCOM] with FCOMImpl

trait FCOMImpl extends FCOM {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD8 /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends NoOp{
    val opcode: OneOpcode = 0xD8 /+ 2
        override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDC /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
