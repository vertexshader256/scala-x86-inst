package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Resume from System Management Mode
// Category: general/branch

object RSM extends InstructionDefinition("RSM") with RSMImpl

trait RSMImpl {
  implicit object RSM_0 extends RSM._0 {
    val opcode: TwoOpcodes = (0x0F, 0xAA)
    override def hasImplicitOperand = true
  }
}
