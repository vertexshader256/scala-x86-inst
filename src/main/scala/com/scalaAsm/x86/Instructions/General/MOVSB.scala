package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

object MOVSB extends InstructionDefinition("MOVSB") with MOVSBImpl

trait MOVSBImpl {
  implicit object MOVSB_0 extends MOVSB._0 {
    val opcode: OneOpcode = 0xA4
    override def hasImplicitOperand = true
  }
}
