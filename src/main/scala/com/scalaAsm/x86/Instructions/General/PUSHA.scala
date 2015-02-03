package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push All General-Purpose Registers
// Category: general/stack

object PUSHA extends InstructionDefinition("PUSHA") with PUSHAImpl

trait PUSHAImpl {
  implicit object PUSHA_0 extends PUSHA._0 {
    val opcode: OneOpcode = 0x60
    override def hasImplicitOperand = true
  }
}
