package com.scalaAsm.x86
package Instructions
package General

// Description: Table Look-up Translation
// Category: general/datamov

trait XLATB extends InstructionDefinition {
  val mnemonic = "XLATB"
}

object XLATB extends ZeroOperands[XLATB] with XLATBImpl

trait XLATBImpl extends XLATB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD7
        override def hasImplicitOperand = true
  }
}
