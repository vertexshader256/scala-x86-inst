package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: ASCII Adjust AL After Subtraction
// Category: general/arith/decimal

object AAS extends InstructionDefinition("AAS") with AASImpl

trait AASImpl {
  implicit object AAS_0 extends AAS._0 {
    val opcode: OneOpcode = 0x3F
    override def hasImplicitOperand = true
  }
}
