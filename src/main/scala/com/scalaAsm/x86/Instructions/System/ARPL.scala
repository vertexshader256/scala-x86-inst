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

object ARPL extends TwoOperands[ARPL] with ARPLImpl

trait ARPLImpl extends ARPL {
  implicit object _0 extends TwoOp[rm16, r16] {
    val opcode: OneOpcode = 0x63 /r
    val format = MemRegFormat
  }
}
