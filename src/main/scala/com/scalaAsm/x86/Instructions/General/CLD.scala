package com.scalaAsm.x86
package Instructions
package General

// Description: Clear Direction Flag
// Category: general/flgctrl

trait CLD extends InstructionDefinition {
  val mnemonic = "CLD"
}

object CLD extends ZeroOperands[CLD] with CLDImpl

trait CLDImpl extends CLD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xFC
      }
}
