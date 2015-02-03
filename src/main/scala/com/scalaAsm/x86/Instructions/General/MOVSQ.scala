package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

object MOVSQ extends InstructionDefinition("MOVSQ") with MOVSQImpl

trait MOVSQImpl {
  implicit object MOVSQ_0 extends MOVSQ._0 {
    val opcode: OneOpcode = 0xA5
    override def hasImplicitOperand = true
  }
}
