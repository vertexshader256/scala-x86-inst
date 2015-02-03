package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Call to Interrupt Procedure
// Category: general/breakstack

object INTO extends InstructionDefinition("INTO") with INTOImpl

trait INTOImpl {
  implicit object INTO_0 extends INTO._0 {
    val opcode: OneOpcode = 0xCE
    override def hasImplicitOperand = true
  }
}
