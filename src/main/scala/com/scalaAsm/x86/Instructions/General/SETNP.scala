package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not parity/parity odd
// Category: general/datamov

trait SETNP extends InstructionDefinition {
  val mnemonic = "SETNP"
}

object SETNP extends OneOperand[SETNP] with SETNPImpl

trait SETNPImpl extends SETNP {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9B) /+ 0
    val format = RmFormat
  }
}
