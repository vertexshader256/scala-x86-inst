package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

trait SETNG extends InstructionDefinition {
  val mnemonic = "SETNG"
}

object SETNG extends OneOperand[SETNG] with SETNGImpl

trait SETNGImpl extends SETNG {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9E) /+ 0
    val format = RmFormat
  }
}
