package com.scalaAsm.x86
package Instructions
package x87

// Description: Clear Exceptions
// Category: general/control

trait FNCLEX extends InstructionDefinition {
  val mnemonic = "FNCLEX"
}

object FNCLEX extends ZeroOperands[FNCLEX] with FNCLEXImpl

trait FNCLEXImpl extends FNCLEX {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
