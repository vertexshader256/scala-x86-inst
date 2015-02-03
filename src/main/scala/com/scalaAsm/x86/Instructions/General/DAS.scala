package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decimal Adjust AL after Subtraction
// Category: general/arith/decimal

object DAS extends InstructionDefinition("DAS") with DASImpl

trait DASImpl {
  implicit object DAS_0 extends DAS._0 {
    val opcode: OneOpcode = 0x2F
    override def hasImplicitOperand = true
  }
}
