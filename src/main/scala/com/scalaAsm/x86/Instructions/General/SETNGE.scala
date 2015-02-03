package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - less/not greater (SF!=OF)
// Category: general/datamov

object SETNGE extends InstructionDefinition("SETNGE") with SETNGEImpl

trait SETNGEImpl {
  implicit object SETNGE_0 extends SETNGE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9C) /+ 0
  }
}
