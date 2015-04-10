package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Carry Flag
// Category: general/flgctrl

trait STC extends InstructionDefinition {
  val mnemonic = "STC"
}

object STC extends STC with ZeroOperands[STC] with STCImpl

trait STCImpl {
  self: STC =>
  implicit object STC_0 extends _0 {
    val opcode: OneOpcode = 0xF9
  }
}
