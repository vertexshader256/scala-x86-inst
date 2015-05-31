package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - below/not above or equal/carry (CF=1)
// Category: general/datamov

trait SETC extends InstructionDefinition {
  val mnemonic = "SETC"
}

object SETC extends OneOperand[SETC] with SETCImpl

trait SETCImpl extends SETC {
  implicit object SETC_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x92) /+ 0
    val explicitFormat = new RmFormat{}
  }
}
