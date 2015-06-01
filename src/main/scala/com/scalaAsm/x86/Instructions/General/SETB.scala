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

object SETB extends OneOperand[SETB] with SETBImpl

trait SETBImpl extends SETB {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x92) /+ 0
    val format = RmFormat
  }
}
