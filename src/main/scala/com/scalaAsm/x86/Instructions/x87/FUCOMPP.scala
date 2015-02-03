package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unordered Compare Floating Point Values and Pop Twice
// Category: general/compar

object FUCOMPP extends InstructionDefinition("FUCOMPP") with FUCOMPPImpl

trait FUCOMPPImpl {
  implicit object FUCOMPP_0 extends FUCOMPP._0 {
    val opcode: OneOpcode = 0xDA /+ 5
    override def hasImplicitOperand = true
  }
}
