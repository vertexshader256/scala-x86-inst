package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push eFLAGS Register onto the Stack
// Category: general/stackflgctrl

object PUSHFD extends InstructionDefinition("PUSHFD") with PUSHFDImpl

trait PUSHFDImpl {
  implicit object PUSHFD_0 extends PUSHFD._0 {
    val opcode: OneOpcode = 0x9C
    override def hasImplicitOperand = true
  }
}
