package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Table Look-up Translation
// Category: general/datamov

object XLAT extends InstructionDefinition("XLAT") with XLATImpl

trait XLATImpl {
  implicit object XLAT_0 extends XLAT._0 {
    val opcode: OneOpcode = 0xD7
    override def hasImplicitOperand = true
  }
}
