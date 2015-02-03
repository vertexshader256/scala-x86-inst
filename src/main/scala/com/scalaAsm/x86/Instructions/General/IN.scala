package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port
// Category: general/inout

object IN extends InstructionDefinition("IN") with INImpl

trait INImpl {
  implicit object IN_0 extends IN._1[imm8] {
    val opcode: OneOpcode = 0xE4
    override def hasImplicitOperand = true
  }

  implicit object IN_1 extends IN._0 {
    val opcode: OneOpcode = 0xEC
    override def hasImplicitOperand = true
  }
}
