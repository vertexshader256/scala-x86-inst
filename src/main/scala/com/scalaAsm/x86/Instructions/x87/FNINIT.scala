package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Initialize Floating-Point Unit
// Category: general/control

trait FNINIT extends InstructionDefinition {
  val mnemonic = "FNINIT"
}

object FNINIT extends FNINIT with FNINITImpl

trait FNINITImpl {
  self: FNINIT =>
  implicit object FNINIT_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
