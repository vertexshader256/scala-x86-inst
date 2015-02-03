package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant +1.0
// Category: general/ldconst

object FLD1 extends InstructionDefinition("FLD1") with FLD1Impl

trait FLD1Impl {
  implicit object FLD1_0 extends FLD1._0 {
    val opcode: OneOpcode = 0xD9 /+ 5
    override def hasImplicitOperand = true
  }
}
