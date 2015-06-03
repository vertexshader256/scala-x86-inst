package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not below or equal/above (CF=0 AND ZF=0)
// Category: general/datamov

trait SETA extends InstructionDefinition {
  val mnemonic = "SETA"
}

object SETA extends OneOperand[SETA] with SETAImpl

trait SETAImpl extends SETA {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x97) /+ 0
    val format = RmFormat
  }
}
