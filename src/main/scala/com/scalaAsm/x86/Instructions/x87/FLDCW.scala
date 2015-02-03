package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load x87 FPU Control Word
// Category: general/control

object FLDCW extends InstructionDefinition("FLDCW") with FLDCWImpl

trait FLDCWImpl {
  implicit object FLDCW_0 extends FLDCW._1[m16] {
    val opcode: OneOpcode = 0xD9 /+ 5
  }
}
