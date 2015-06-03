package com.scalaAsm.x86
package Instructions
package General

// Description: Input from Port to String
// Category: general/inoutstring

trait INSW extends InstructionDefinition {
  val mnemonic = "INSW"
}

object INSW extends ZeroOperands[INSW] with INSWImpl

trait INSWImpl extends INSW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6D
        override def hasImplicitOperand = true
  }
}
