package com.scalaAsm.x86
package Instructions
package System

// Description: Get Value of Extended Control Register
// Category: general

trait XGETBV extends InstructionDefinition {
  val mnemonic = "XGETBV"
}

object XGETBV extends ZeroOperands[XGETBV] with XGETBVImpl

trait XGETBVImpl extends XGETBV {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 2
        override def hasImplicitOperand = true
  }
}
