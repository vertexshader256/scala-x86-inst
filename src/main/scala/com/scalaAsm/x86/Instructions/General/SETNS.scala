package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not sign (SF=0)
// Category: general/datamov

trait SETNS extends InstructionDefinition {
  val mnemonic = "SETNS"
}

object SETNS extends SETNS with OneOperand[SETNS] with SETNSImpl

trait SETNSImpl {
  self: SETNS =>
  implicit object SETNS_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x99) /+ 0
  }
}
