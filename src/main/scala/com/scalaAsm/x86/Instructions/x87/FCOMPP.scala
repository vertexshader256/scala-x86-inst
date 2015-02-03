package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Real and Pop Twice
// Category: general/compar

object FCOMPP extends InstructionDefinition("FCOMPP") with FCOMPPImpl

trait FCOMPPImpl {
  implicit object FCOMPP_0 extends FCOMPP._0 {
    val opcode: OneOpcode = 0xDE /+ 3
    override def hasImplicitOperand = true
  }
}
