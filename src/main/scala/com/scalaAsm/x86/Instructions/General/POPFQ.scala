package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop Stack into rFLAGS Register
// Category: general/stackflgctrl

object POPFQ extends InstructionDefinition("POPFQ") with POPFQImpl

trait POPFQImpl {
  implicit object POPFQ_0 extends POPFQ._0 {
    val opcode: OneOpcode = 0x9D
    override def hasImplicitOperand = true
  }
}
