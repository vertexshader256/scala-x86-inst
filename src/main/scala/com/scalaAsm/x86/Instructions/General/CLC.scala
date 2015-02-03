package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Carry Flag
// Category: general/flgctrl

object CLC extends InstructionDefinition("CLC") with CLCImpl

trait CLCImpl {
  implicit object CLC_0 extends CLC._0 {
    val opcode: OneOpcode = 0xF8
  }
}
