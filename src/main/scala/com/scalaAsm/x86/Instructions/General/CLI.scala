package com.scalaAsm.x86
package Instructions
package General

// Description: Clear Interrupt Flag
// Category: general/flgctrl

trait CLI extends InstructionDefinition {
  val mnemonic = "CLI"
}

object CLI extends ZeroOperands[CLI] with CLIImpl

trait CLIImpl extends CLI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xFA
      }
}
