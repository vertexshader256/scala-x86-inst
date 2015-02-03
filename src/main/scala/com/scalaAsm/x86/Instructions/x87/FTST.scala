package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Test
// Category: general/compar

object FTST extends InstructionDefinition("FTST") with FTSTImpl

trait FTSTImpl {
  implicit object FTST_0 extends FTST._0 {
    val opcode: OneOpcode = 0xD9 /+ 4
    override def hasImplicitOperand = true
  }
}
