package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - zero/equal (ZF=0)
// Category: general/datamov

object SETZ extends InstructionDefinition("SETZ") with SETZImpl

trait SETZImpl {
  implicit object SETZ_0 extends SETZ._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x94) /+ 0
  }
}
