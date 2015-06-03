package com.scalaAsm.x86
package Instructions
package x87

// Description: Enable NPX Interrupt
// Category: general/control

trait FENI extends InstructionDefinition {
  val mnemonic = "FENI"
}

object FENI extends ZeroOperands[FENI] with FENIImpl

trait FENIImpl extends FENI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
