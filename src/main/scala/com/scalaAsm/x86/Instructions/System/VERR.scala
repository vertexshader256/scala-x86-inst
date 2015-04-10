package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Verify a Segment for Reading
// Category: general

trait VERR extends InstructionDefinition {
  val mnemonic = "VERR"
}

object VERR extends VERR with OneOperand[VERR] with VERRImpl

trait VERRImpl {
  self: VERR =>
  implicit object VERR_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 4
  }
}
