package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not overflow (OF=0)
// Category: general/datamov

trait SETNO extends InstructionDefinition {
  val mnemonic = "SETNO"
}

object SETNO extends SETNO with OneOperand[SETNO] with SETNOImpl

trait SETNOImpl {
  self: SETNO =>
  implicit object SETNO_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x91) /+ 0
  }
}
