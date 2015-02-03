package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Make Stack Frame for Procedure Parameters
// Category: general/stack

object ENTER extends InstructionDefinition("ENTER") with ENTERImpl

trait ENTERImpl {
  implicit object ENTER_0 extends ENTER._2[imm16, imm8] {
    val opcode: OneOpcode = 0xC8
    override def hasImplicitOperand = true
  }
}
