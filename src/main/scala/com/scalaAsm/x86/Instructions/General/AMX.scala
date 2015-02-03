package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Adjust AX After Multiply
// Category: general/arith/decimal

object AMX extends InstructionDefinition("AMX") with AMXImpl

trait AMXImpl {
  implicit object AMX_0 extends AMX._1[imm8] {
    val opcode: OneOpcode = 0xD4
    override def hasImplicitOperand = true
  }
}
