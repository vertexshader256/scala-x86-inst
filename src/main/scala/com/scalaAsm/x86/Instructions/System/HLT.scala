package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Halt
// Category: general

object HLT extends InstructionDefinition("HLT") with HLTImpl

trait HLTImpl {
  implicit object HLT_0 extends HLT._0 {
    val opcode: OneOpcode = 0xF4
  }
}
