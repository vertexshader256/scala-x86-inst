package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - zero/equal (ZF=0)
// Category: general/datamov

trait CMOVE extends InstructionDefinition {
  val mnemonic = "CMOVE"
}

object CMOVE extends TwoOperands[CMOVE] with CMOVEImpl

trait CMOVEImpl extends CMOVE {
  implicit object CMOVE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x44) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x44) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x44) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }
}
