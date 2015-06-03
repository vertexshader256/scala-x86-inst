package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - zero/equal (ZF=0)
// Category: general/datamov

trait SETZ extends InstructionDefinition {
  val mnemonic = "SETZ"
}

object SETZ extends OneOperand[SETZ] with SETZImpl

trait SETZImpl extends SETZ {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x94) /+ 0
    val format = RmFormat
  }
}
