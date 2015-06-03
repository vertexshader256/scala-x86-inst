package com.scalaAsm.x86
package Instructions
package x87

// Description: Load x87 FPU Control Word
// Category: general/control

trait FLDCW extends InstructionDefinition {
  val mnemonic = "FLDCW"
}

object FLDCW extends OneOperand[FLDCW] with FLDCWImpl

trait FLDCWImpl extends FLDCW {
  implicit object _0 extends OneOp[m16] {
    val opcode: OneOpcode = 0xD9 /+ 5
    val format = RmFormat
  }
}
