package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below/above or equal/not carry (CF=0)
// Category: general/datamov

object SETAE extends InstructionDefinition("SETAE") with SETAEImpl

trait SETAEImpl {
  implicit object SETAE_0 extends SETAE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x93) /+ 0
  }
}
