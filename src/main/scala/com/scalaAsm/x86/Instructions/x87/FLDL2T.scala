package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant log210
// Category: general/ldconst

object FLDL2T extends InstructionDefinition("FLDL2T") with FLDL2TImpl

trait FLDL2TImpl {
  implicit object FLDL2T_0 extends FLDL2T._0 {
    val opcode: OneOpcode = 0xD9 /+ 5
    override def hasImplicitOperand = true
  }
}
