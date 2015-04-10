package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Interrupt Flag
// Category: general/flgctrl

trait CLI extends InstructionDefinition {
  val mnemonic = "CLI"
}

object CLI extends CLI with ZeroOperands[CLI] with CLIImpl

trait CLIImpl {
  self: CLI =>
  implicit object CLI_0 extends _0 {
    val opcode: OneOpcode = 0xFA
  }
}
