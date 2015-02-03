package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not parity/parity odd
// Category: general/datamov

object SETPO extends InstructionDefinition("SETPO") with SETPOImpl

trait SETPOImpl {
  implicit object SETPO_0 extends SETPO._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9B) /+ 0
  }
}
