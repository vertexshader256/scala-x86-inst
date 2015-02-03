package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

object OUTSB extends InstructionDefinition("OUTSB") with OUTSBImpl

trait OUTSBImpl {
  implicit object OUTSB_0 extends OUTSB._0 {
    val opcode: OneOpcode = 0x6E
    override def hasImplicitOperand = true
  }
}
