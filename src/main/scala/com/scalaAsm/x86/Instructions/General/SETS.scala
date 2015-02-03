package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - sign (SF=1)
// Category: general/datamov

object SETS extends InstructionDefinition("SETS") with SETSImpl

trait SETSImpl {
  implicit object SETS_0 extends SETS._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x98) /+ 0
  }
}
