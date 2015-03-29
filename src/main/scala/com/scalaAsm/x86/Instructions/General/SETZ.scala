package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - zero/equal (ZF=0)
// Category: general/datamov

trait SETZ extends InstructionDefinition {
  val mnemonic = "SETZ"
}

object SETZ extends SETZ with SETZImpl

trait SETZImpl {
  self: SETZ =>
  implicit object SETZ_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x94) /+ 0
  }
}
