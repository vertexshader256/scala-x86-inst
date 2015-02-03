package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Direction Flag
// Category: general/flgctrl

object STD extends InstructionDefinition("STD") with STDImpl

trait STDImpl {
  implicit object STD_0 extends STD._0 {
    val opcode: OneOpcode = 0xFD
  }
}
