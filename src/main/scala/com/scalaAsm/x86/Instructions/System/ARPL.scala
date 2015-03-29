package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Adjust RPL Field of Segment Selector
// Category: general

trait ARPL extends InstructionDefinition {
  val mnemonic = "ARPL"
}

object ARPL extends ARPL with ARPLImpl

trait ARPLImpl {
  self: ARPL =>
  implicit object ARPL_0 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x63 /r
  }
}
