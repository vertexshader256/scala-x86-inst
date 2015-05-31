package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Control Word
// Category: general/control

trait FSTCW extends InstructionDefinition {
  val mnemonic = "FSTCW"
}

object FSTCW extends OneOperand[FSTCW] with FSTCWImpl

trait FSTCWImpl extends FSTCW {
  implicit object FSTCW_0 extends _1[m16] {
    val opcode: OneOpcode = 0xD9 /+ 7
    val format = RmFormat
    val hasRMByte = true
  }
}
