package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store String
// Category: general/datamovstring

object STOSB extends InstructionDefinition("STOSB") with STOSBImpl

trait STOSBImpl {
  implicit object STOSB_0 extends STOSB._0 {
    val opcode: OneOpcode = 0xAA
    override def hasImplicitOperand = true
  }
}
