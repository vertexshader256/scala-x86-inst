package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - not less/greater or equal (SF=OF)
// Category: general/datamov

trait SETNL extends InstructionDefinition {
  val mnemonic = "SETNL"
}

object SETNL extends OneOperand[SETNL] with SETNLImpl

trait SETNLImpl extends SETNL {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9D) /+ 0
    val format = RmFormat
  }
}
