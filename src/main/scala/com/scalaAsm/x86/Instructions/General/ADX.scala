package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Adjust AX Before Division
// Category: general/arith/decimal

object ADX extends InstructionDefinition("ADX") with ADXImpl

trait ADXImpl {
  implicit object ADX_0 extends ADX._1[imm8] {
    val opcode: OneOpcode = 0xD5
    override def hasImplicitOperand = true
  }
}
