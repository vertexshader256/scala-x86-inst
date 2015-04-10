package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Direction Flag
// Category: general/flgctrl

trait CLD extends InstructionDefinition {
  val mnemonic = "CLD"
}

object CLD extends CLD with ZeroOperands[CLD] with CLDImpl

trait CLDImpl {
  self: CLD =>
  implicit object CLD_0 extends _0 {
    val opcode: OneOpcode = 0xFC
  }
}
