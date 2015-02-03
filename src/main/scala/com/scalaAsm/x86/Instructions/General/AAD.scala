package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: ASCII Adjust AX Before Division
// Category: general/arith/decimal

object AAD extends InstructionDefinition("AAD") with AADImpl

trait AADImpl {
  implicit object AAD_0 extends AAD._0 {
    val opcode: OneOpcode = 0xD5
    override def hasImplicitOperand = true
  }
}
