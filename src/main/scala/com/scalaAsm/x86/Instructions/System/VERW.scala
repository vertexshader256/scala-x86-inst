package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Verify a Segment for Writing
// Category: general

trait VERW extends InstructionDefinition {
  val mnemonic = "VERW"
}

object VERW extends OneOperand[VERW] with VERWImpl

trait VERWImpl extends VERW {
  implicit object VERW_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 5
  }
}
