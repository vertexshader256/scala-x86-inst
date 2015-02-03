package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - overflow (OF=1)
// Category: general/datamov

object SETO extends InstructionDefinition("SETO") with SETOImpl

trait SETOImpl {
  implicit object SETO_0 extends SETO._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x90) /+ 0
  }
}
