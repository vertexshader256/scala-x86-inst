package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - less/not greater (SF!=OF)
// Category: general/datamov

trait SETL extends InstructionDefinition {
  val mnemonic = "SETL"
}

object SETL extends OneOperand[SETL] with SETLImpl

trait SETLImpl extends SETL {
  implicit object SETL_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9C) /+ 0
    val explicitFormat = new RmFormat{}
  }
}
