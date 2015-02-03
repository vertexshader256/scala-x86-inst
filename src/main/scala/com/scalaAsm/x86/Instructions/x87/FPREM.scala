package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Partial Remainder (for compatibility with i8087 and i287)
// Category: general/arith

object FPREM extends InstructionDefinition("FPREM") with FPREMImpl

trait FPREMImpl {
  implicit object FPREM_0 extends FPREM._0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
