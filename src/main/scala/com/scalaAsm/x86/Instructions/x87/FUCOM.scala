package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unordered Compare Floating Point Values
// Category: general/compar

object FUCOM extends InstructionDefinition("FUCOM") with FUCOMImpl

trait FUCOMImpl {
  implicit object FUCOM_0 extends FUCOM._0 {
    val opcode: OneOpcode = 0xDD /+ 4
    override def hasImplicitOperand = true
  }
}
