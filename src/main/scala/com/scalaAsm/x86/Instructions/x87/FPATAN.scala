package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Partial Arctangent and Pop
// Category: general/trans

object FPATAN extends InstructionDefinition("FPATAN") with FPATANImpl

trait FPATANImpl {
  implicit object FPATAN_0 extends FPATAN._0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
