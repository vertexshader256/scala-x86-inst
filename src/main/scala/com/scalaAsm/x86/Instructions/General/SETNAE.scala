package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - below/not above or equal/carry (CF=1)
// Category: general/datamov

trait SETNAE extends InstructionDefinition {
  val mnemonic = "SETNAE"
}

object SETNAE extends OneOperand[SETNAE] with SETNAEImpl

trait SETNAEImpl extends SETNAE {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x92) /+ 0
    val format = RmFormat
  }
}
