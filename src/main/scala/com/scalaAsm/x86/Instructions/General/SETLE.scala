package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

trait SETLE extends InstructionDefinition {
  val mnemonic = "SETLE"
}

object SETLE extends OneOperand[SETLE] with SETLEImpl

trait SETLEImpl extends SETLE {
  implicit object SETLE_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9E) /+ 0
    val format = RmFormat
    val hasRMByte = true
  }
}
