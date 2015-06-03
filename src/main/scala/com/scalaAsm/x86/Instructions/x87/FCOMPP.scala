package com.scalaAsm.x86
package Instructions
package x87

// Description: Compare Real and Pop Twice
// Category: general/compar

trait FCOMPP extends InstructionDefinition {
  val mnemonic = "FCOMPP"
}

object FCOMPP extends ZeroOperands[FCOMPP] with FCOMPPImpl

trait FCOMPPImpl extends FCOMPP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDE /+ 3
        override def hasImplicitOperand = true
  }
}
