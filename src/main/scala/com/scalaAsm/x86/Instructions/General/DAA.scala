package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decimal Adjust AL after Addition
// Category: general/arith/decimal

object DAA extends InstructionDefinition("DAA") with DAAImpl

trait DAAImpl {
  implicit object DAA_0 extends DAA._0 {
    val opcode: OneOpcode = 0x27
    override def hasImplicitOperand = true
  }
}
