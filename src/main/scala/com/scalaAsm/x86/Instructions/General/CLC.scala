package com.scalaAsm.x86
package Instructions
package General

// Description: Clear Carry Flag
// Category: general/flgctrl

trait CLC extends InstructionDefinition {
  val mnemonic = "CLC"
}

object CLC extends ZeroOperands[CLC] with CLCImpl

trait CLCImpl extends CLC {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xF8
      }
}
