package com.scalaAsm.x86
package Instructions
package System

// Description: Verify a Segment for Writing
// Category: general

trait VERW extends InstructionDefinition {
  val mnemonic = "VERW"
}

object VERW extends OneOperand[VERW] with VERWImpl

trait VERWImpl extends VERW {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 5
    val format = RmFormat
  }
}
