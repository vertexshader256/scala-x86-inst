package com.scalaAsm.x86
package Instructions
package General

// Description: Input from Port to String
// Category: general/inoutstring

trait INS extends InstructionDefinition {
  val mnemonic = "INS"
}

object INS extends ZeroOperands[INS] with INSImpl

trait INSImpl extends INS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6C
        override def hasImplicitOperand = true
  }
}
