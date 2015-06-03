package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - less/not greater (SF!=OF)
// Category: general/datamov

trait SETL extends InstructionDefinition {
  val mnemonic = "SETL"
}

object SETL extends OneOperand[SETL] with SETLImpl

trait SETLImpl extends SETL {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9C) /+ 0
    val format = RmFormat
  }
}
