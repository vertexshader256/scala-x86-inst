package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - below/not above or equal/carry (CF=1)
// Category: general/datamov

trait SETB extends InstructionDefinition {
  val mnemonic = "SETB"
}

object SETB extends SETB with OneOperand[SETB] with SETBImpl

trait SETBImpl {
  self: SETB =>
  implicit object SETB_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x92) /+ 0
  }
}
