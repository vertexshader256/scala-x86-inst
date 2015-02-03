package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below/above or equal/not carry (CF=0)
// Category: general/datamov

object SETNB extends InstructionDefinition("SETNB") with SETNBImpl

trait SETNBImpl {
  implicit object SETNB_0 extends SETNB._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x93) /+ 0
  }
}
