package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Access Rights Byte
// Category: general

trait LAR extends InstructionDefinition {
  val mnemonic = "LAR"
}

object LAR extends TwoOperands[LAR] with LARImpl

trait LARImpl extends LAR {
  implicit object LAR_0 extends _2[r16, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object LAR_1 extends _2[r32, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object LAR_2 extends _2[r64, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object LAR_3 extends _2[r16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object LAR_4 extends _2[r32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object LAR_5 extends _2[r64, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x02) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }
}
