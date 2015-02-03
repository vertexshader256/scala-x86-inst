package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant log102
// Category: general/ldconst

object FLDLG2 extends InstructionDefinition("FLDLG2") with FLDLG2Impl

trait FLDLG2Impl {
  implicit object FLDLG2_0 extends FLDLG2._0 {
    val opcode: OneOpcode = 0xD9 /+ 5
    override def hasImplicitOperand = true
  }
}
