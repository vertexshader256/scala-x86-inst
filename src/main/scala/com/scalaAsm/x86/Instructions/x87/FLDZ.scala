package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant +0.0
// Category: general/ldconst

object FLDZ extends InstructionDefinition("FLDZ") with FLDZImpl

trait FLDZImpl {
  implicit object FLDZ_0 extends FLDZ._0 {
    val opcode: OneOpcode = 0xD9 /+ 5
    override def hasImplicitOperand = true
  }
}
