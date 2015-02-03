package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump to IA-64 Instruction Set
// Category: general/branch

object JMPE extends InstructionDefinition("JMPE") with JMPEImpl

trait JMPEImpl {
  implicit object JMPE_0 extends JMPE._0 {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 6
  }
}
