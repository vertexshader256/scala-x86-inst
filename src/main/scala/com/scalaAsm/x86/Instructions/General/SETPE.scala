package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - parity/parity even (PF=1)
// Category: general/datamov

trait SETPE extends InstructionDefinition {
  val mnemonic = "SETPE"
}

object SETPE extends OneOperand[SETPE] with SETPEImpl

trait SETPEImpl extends SETPE {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9A) /+ 0
    val format = RmFormat
  }
}
