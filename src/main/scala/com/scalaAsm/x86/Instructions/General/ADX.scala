package com.scalaAsm.x86
package Instructions
package General

// Description: Adjust AX Before Division
// Category: general/arith/decimal

trait ADX extends InstructionDefinition {
  val mnemonic = "ADX"
}

object ADX extends OneOperand[ADX] with ADXImpl

trait ADXImpl extends ADX {
  implicit object _0 extends OneOp[imm8] {
    val opcode: OneOpcode = 0xD5
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
