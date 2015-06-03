package com.scalaAsm.x86
package Instructions
package General

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LES extends InstructionDefinition {
  val mnemonic = "LES"
}

object LES extends TwoOperands[LES] with LESImpl

trait LESImpl extends LES {
  implicit object _0 extends TwoOp[r16, m] {
    val opcode: OneOpcode = 0xC4 /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[r32, m] {
    val opcode: OneOpcode = 0xC4 /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }
}
