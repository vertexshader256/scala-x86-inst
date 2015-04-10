package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - parity/parity even (PF=1)
// Category: general/datamov

trait SETPE extends InstructionDefinition {
  val mnemonic = "SETPE"
}

object SETPE extends SETPE with OneOperand[SETPE] with SETPEImpl

trait SETPEImpl {
  self: SETPE =>
  implicit object SETPE_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9A) /+ 0
  }
}
