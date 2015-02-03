package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

object SETLE extends InstructionDefinition("SETLE") with SETLEImpl

trait SETLEImpl {
  implicit object SETLE_0 extends SETLE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9E) /+ 0
  }
}
