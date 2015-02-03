package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Examine
// Category: general

object FXAM extends InstructionDefinition("FXAM") with FXAMImpl

trait FXAMImpl {
  implicit object FXAM_0 extends FXAM._0 {
    val opcode: OneOpcode = 0xD9 /+ 4
    override def hasImplicitOperand = true
  }
}
