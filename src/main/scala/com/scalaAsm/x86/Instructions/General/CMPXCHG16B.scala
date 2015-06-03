package com.scalaAsm.x86
package Instructions
package General

// Description: Compare and Exchange Bytes
// Category: general/datamovarith/binary

trait CMPXCHG16B extends InstructionDefinition {
  val mnemonic = "CMPXCHG16B"
}

object CMPXCHG16B extends OneOperand[CMPXCHG16B] with CMPXCHG16BImpl

trait CMPXCHG16BImpl extends CMPXCHG16B {
  implicit object _0 extends OneOp[m128] {
    val opcode: TwoOpcodes = (0x0F, 0xC7) /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
