package com.scalaAsm.x86
package Instructions
package General

// Description: Store String
// Category: general/datamovstring

trait STOSW extends InstructionDefinition {
  val mnemonic = "STOSW"
}

object STOSW extends ZeroOperands[STOSW] with STOSWImpl

trait STOSWImpl extends STOSW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAB
        override def hasImplicitOperand = true
  }
}
