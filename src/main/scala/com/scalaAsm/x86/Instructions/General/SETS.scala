package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - sign (SF=1)
// Category: general/datamov

trait SETS extends InstructionDefinition {
  val mnemonic = "SETS"
}

object SETS extends OneOperand[SETS] with SETSImpl

trait SETSImpl extends SETS {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x98) /+ 0
    val format = RmFormat
  }
}
