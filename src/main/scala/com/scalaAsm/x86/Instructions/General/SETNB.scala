package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below/above or equal/not carry (CF=0)
// Category: general/datamov

trait SETNB extends InstructionDefinition {
  val mnemonic = "SETNB"
}

object SETNB extends SETNB with SETNBImpl

trait SETNBImpl {
  self: SETNB =>
  implicit object SETNB_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x93) /+ 0
  }
}
