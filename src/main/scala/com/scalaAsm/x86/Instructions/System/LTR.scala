package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Task Register
// Category: general

object LTR extends InstructionDefinition("LTR") with LTRImpl

trait LTRImpl {
  implicit object LTR_0 extends LTR._1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 3
    override def hasImplicitOperand = true
  }
}
