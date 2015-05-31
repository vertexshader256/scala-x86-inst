package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Task Register
// Category: general

trait STR extends InstructionDefinition {
  val mnemonic = "STR"
}

object STR extends OneOperand[STR] with STRImpl

trait STRImpl extends STR {
  implicit object STR_0 extends _1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object STR_1 extends _1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object STR_2 extends _1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object STR_3 extends _1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 1
    override def prefix = REX.W(true)
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
