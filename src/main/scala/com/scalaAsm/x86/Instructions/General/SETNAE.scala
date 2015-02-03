package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - below/not above or equal/carry (CF=1)
// Category: general/datamov

object SETNAE extends InstructionDefinition("SETNAE") with SETNAEImpl

trait SETNAEImpl {
  implicit object SETNAE_0 extends SETNAE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x92) /+ 0
  }
}
