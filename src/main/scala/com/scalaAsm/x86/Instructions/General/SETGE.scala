package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not less/greater or equal (SF=OF)
// Category: general/datamov

object SETGE extends InstructionDefinition("SETGE") with SETGEImpl

trait SETGEImpl {
  implicit object SETGE_0 extends SETGE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9D) /+ 0
  }
}
