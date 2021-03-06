package com.scalaAsm.x86
package Instructions
package General

// Description: Set Direction Flag
// Category: general/flgctrl

trait STD extends InstructionDefinition {
  val mnemonic = "STD"
}

object STD extends ZeroOperands[STD] with STDImpl

trait STDImpl extends STD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xFD
      }
}
