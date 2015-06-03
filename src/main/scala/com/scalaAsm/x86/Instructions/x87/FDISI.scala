package com.scalaAsm.x86
package Instructions
package x87

// Description: Disable NPX Interrupt
// Category: general/control

trait FDISI extends InstructionDefinition {
  val mnemonic = "FDISI"
}

object FDISI extends ZeroOperands[FDISI] with FDISIImpl

trait FDISIImpl extends FDISI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
