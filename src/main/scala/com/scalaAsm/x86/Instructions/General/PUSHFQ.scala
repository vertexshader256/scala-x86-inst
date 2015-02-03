package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push rFLAGS Register onto the Stack
// Category: general/stackflgctrl

object PUSHFQ extends InstructionDefinition("PUSHFQ") with PUSHFQImpl

trait PUSHFQImpl {
  implicit object PUSHFQ_0 extends PUSHFQ._0 {
    val opcode: OneOpcode = 0x9C
    override def hasImplicitOperand = true
  }
}
