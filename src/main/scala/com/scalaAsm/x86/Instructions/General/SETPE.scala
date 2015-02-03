package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - parity/parity even (PF=1)
// Category: general/datamov

object SETPE extends InstructionDefinition("SETPE") with SETPEImpl

trait SETPEImpl {
  implicit object SETPE_0 extends SETPE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9A) /+ 0
  }
}
