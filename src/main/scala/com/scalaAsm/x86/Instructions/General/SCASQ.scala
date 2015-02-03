package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

object SCASQ extends InstructionDefinition("SCASQ") with SCASQImpl

trait SCASQImpl {
  implicit object SCASQ_0 extends SCASQ._0 {
    val opcode: OneOpcode = 0xAF
    override def hasImplicitOperand = true
  }
}
