package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Segment Limit
// Category: general

object LSL extends InstructionDefinition("LSL") with LSLImpl

trait LSLImpl {
  implicit object LSL_0 extends LSL._2[r16, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
  }

  implicit object LSL_1 extends LSL._2[r32, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
  }

  implicit object LSL_2 extends LSL._2[r64, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    override def prefix = REX.W(true)
  }

  implicit object LSL_3 extends LSL._2[r16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
  }

  implicit object LSL_4 extends LSL._2[r32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
  }

  implicit object LSL_5 extends LSL._2[r64, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    override def prefix = REX.W(true)
  }
}
