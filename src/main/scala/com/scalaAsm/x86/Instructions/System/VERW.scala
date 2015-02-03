package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Verify a Segment for Writing
// Category: general

object VERW extends InstructionDefinition("VERW") with VERWImpl

trait VERWImpl {
  implicit object VERW_0 extends VERW._1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 5
  }
}
