package com.scalaAsm.x86
package Instructions
package x87

// Description: Store x87 FPU Control Word
// Category: general/control

trait FNSTCW extends InstructionDefinition {
  val mnemonic = "FNSTCW"
}

object FNSTCW extends OneOperand[FNSTCW] with FNSTCWImpl

trait FNSTCWImpl extends FNSTCW {
  implicit object _0 extends OneOp[m16] {
    val opcode: OneOpcode = 0xD9 /+ 7
    val format = RmFormat
  }
}
