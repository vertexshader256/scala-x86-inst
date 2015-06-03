package com.scalaAsm.x86
package Instructions
package x87

// Description: Empty MMX Technology State
// Category: general/control

trait EMMS extends InstructionDefinition {
  val mnemonic = "EMMS"
}

object EMMS extends ZeroOperands[EMMS] with EMMSImpl

trait EMMSImpl extends EMMS {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x77)
      }
}
