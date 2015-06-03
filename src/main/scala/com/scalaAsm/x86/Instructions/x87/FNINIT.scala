package com.scalaAsm.x86
package Instructions
package x87

// Description: Initialize Floating-Point Unit
// Category: general/control

trait FNINIT extends InstructionDefinition {
  val mnemonic = "FNINIT"
}

object FNINIT extends ZeroOperands[FNINIT] with FNINITImpl

trait FNINITImpl extends FNINIT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
