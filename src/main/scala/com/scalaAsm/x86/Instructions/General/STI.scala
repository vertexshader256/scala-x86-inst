package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Interrupt Flag
// Category: general/flgctrl

trait STI extends InstructionDefinition {
  val mnemonic = "STI"
}

object STI extends STI with STIImpl

trait STIImpl {
  self: STI =>
  implicit object STI_0 extends _0 {
    val opcode: OneOpcode = 0xFB
  }
}
