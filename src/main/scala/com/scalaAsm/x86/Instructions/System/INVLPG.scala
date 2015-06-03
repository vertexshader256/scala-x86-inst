package com.scalaAsm.x86
package Instructions
package System

// Description: Invalidate TLB Entry
// Category: general

trait INVLPG extends InstructionDefinition {
  val mnemonic = "INVLPG"
}

object INVLPG extends OneOperand[INVLPG] with INVLPGImpl

trait INVLPGImpl extends INVLPG {
  implicit object _0 extends OneOp[m] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
    val format = RmFormat
  }
}
