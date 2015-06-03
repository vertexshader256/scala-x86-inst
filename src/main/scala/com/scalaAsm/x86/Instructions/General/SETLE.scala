package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

trait SETLE extends InstructionDefinition {
  val mnemonic = "SETLE"
}

object SETLE extends OneOperand[SETLE] with SETLEImpl

trait SETLEImpl extends SETLE {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9E) /+ 0
    val format = RmFormat
  }
}
