package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below/above or equal/not carry (CF=0)
// Category: general/datamov

object SETNC extends InstructionDefinition("SETNC") with SETNCImpl

trait SETNCImpl {
  implicit object SETNC_0 extends SETNC._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x93) /+ 0
  }
}
