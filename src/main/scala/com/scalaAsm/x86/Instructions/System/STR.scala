package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Task Register
// Category: general

object STR extends InstructionDefinition("STR") with STRImpl

trait STRImpl {
  implicit object STR_0 extends STR._1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    override def hasImplicitOperand = true
  }

  implicit object STR_1 extends STR._1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    override def hasImplicitOperand = true
  }

  implicit object STR_2 extends STR._1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    override def hasImplicitOperand = true
  }

  implicit object STR_3 extends STR._1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
