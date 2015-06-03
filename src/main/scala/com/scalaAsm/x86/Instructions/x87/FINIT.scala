package com.scalaAsm.x86
package Instructions
package x87

// Description: Initialize Floating-Point Unit
// Category: general/control

trait FINIT extends InstructionDefinition {
  val mnemonic = "FINIT"
}

object FINIT extends ZeroOperands[FINIT] with FINITImpl

trait FINITImpl extends FINIT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
