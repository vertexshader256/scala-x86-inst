package com.scalaAsm.x86
package Instructions
package General

// Description: Load Effective Address
// Category: general/datamov

trait LEA extends InstructionDefinition {
  val mnemonic = "LEA"
}

object LEA extends TwoOperands[LEA] with LEAImpl

trait LEAImpl extends LEA {
  implicit object _0 extends TwoOp[r16, m] {
    val opcode: OneOpcode = 0x8D /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, m] {
    val opcode: OneOpcode = 0x8D /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, m] {
    val opcode: OneOpcode = 0x8D /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
