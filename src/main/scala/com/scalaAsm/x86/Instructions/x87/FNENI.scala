package com.scalaAsm.x86
package Instructions
package x87

// Description: Enable NPX Interrupt
// Category: general/control

trait FNENI extends InstructionDefinition {
  val mnemonic = "FNENI"
}

object FNENI extends ZeroOperands[FNENI] with FNENIImpl

trait FNENIImpl extends FNENI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
