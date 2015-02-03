package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Interrupt Flag
// Category: general/flgctrl

object CLI extends InstructionDefinition("CLI") with CLIImpl

trait CLIImpl {
  implicit object CLI_0 extends CLI._0 {
    val opcode: OneOpcode = 0xFA
  }
}
