package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not overflow (OF=0)
// Category: general/datamov

trait SETNO extends InstructionDefinition {
  val mnemonic = "SETNO"
}

object SETNO extends OneOperand[SETNO] with SETNOImpl

trait SETNOImpl extends SETNO {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x91) /+ 0
    val format = RmFormat
  }
}
