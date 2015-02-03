package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port to String
// Category: general/inoutstring

object INSB extends InstructionDefinition("INSB") with INSBImpl

trait INSBImpl {
  implicit object INSB_0 extends INSB._0 {
    val opcode: OneOpcode = 0x6C
    override def hasImplicitOperand = true
  }
}
