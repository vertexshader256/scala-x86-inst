package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not below/above or equal/not carry (CF=0)
// Category: general/datamov

trait SETAE extends InstructionDefinition {
  val mnemonic = "SETAE"
}

object SETAE extends OneOperand[SETAE] with SETAEImpl

trait SETAEImpl extends SETAE {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x93) /+ 0
    val format = RmFormat
  }
}
