package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unordered Compare Floating Point Values and Pop
// Category: general/compar

object FUCOMP extends InstructionDefinition("FUCOMP") with FUCOMPImpl

trait FUCOMPImpl {
  implicit object FUCOMP_0 extends FUCOMP._0 {
    val opcode: OneOpcode = 0xDD /+ 5
    override def hasImplicitOperand = true
  }
}
