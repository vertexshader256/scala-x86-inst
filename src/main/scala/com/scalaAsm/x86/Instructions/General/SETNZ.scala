package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not zero/not equal (ZF=1)
// Category: general/datamov

trait SETNZ extends InstructionDefinition {
  val mnemonic = "SETNZ"
}

object SETNZ extends OneOperand[SETNZ] with SETNZImpl

trait SETNZImpl extends SETNZ {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x95) /+ 0
    val format = RmFormat
  }
}
