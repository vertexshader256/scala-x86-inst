package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push All General-Purpose Registers
// Category: general/stack

object PUSHAD extends InstructionDefinition("PUSHAD") with PUSHADImpl

trait PUSHADImpl {
  implicit object PUSHAD_0 extends PUSHAD._0 {
    val opcode: OneOpcode = 0x60
    override def hasImplicitOperand = true
  }
}
