package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Control Word
// Category: general/control

object FSTCW extends InstructionDefinition("FSTCW") with FSTCWImpl

trait FSTCWImpl {
  implicit object FSTCW_0 extends FSTCW._1[m16] {
    val opcode: OneOpcode = 0xD9 /+ 7
  }
}
