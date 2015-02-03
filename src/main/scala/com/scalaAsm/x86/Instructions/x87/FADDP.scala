package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add and Pop
// Category: general/arith

object FADDP extends InstructionDefinition("FADDP") with FADDPImpl

trait FADDPImpl {
  implicit object FADDP_0 extends FADDP._0 {
    val opcode: OneOpcode = 0xDE /+ 0
    override def hasImplicitOperand = true
  }
}
