package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not parity/parity odd
// Category: general/datamov

trait SETPO extends InstructionDefinition {
  val mnemonic = "SETPO"
}

object SETPO extends OneOperand[SETPO] with SETPOImpl

trait SETPOImpl extends SETPO {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9B) /+ 0
    val format = RmFormat
  }
}
