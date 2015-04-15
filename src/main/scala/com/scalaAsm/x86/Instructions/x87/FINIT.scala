package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Initialize Floating-Point Unit
// Category: general/control

trait FINIT extends InstructionDefinition {
  val mnemonic = "FINIT"
}

object FINIT extends ZeroOperands[FINIT] with FINITImpl

trait FINITImpl extends FINIT {
  implicit object FINIT_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
