package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - below or equal/not above (CF=1 AND ZF=1)
// Category: general/datamov

trait CMOVNA extends InstructionDefinition {
  val mnemonic = "CMOVNA"
}

object CMOVNA extends TwoOperands[CMOVNA] with CMOVNAImpl

trait CMOVNAImpl extends CMOVNA {
  implicit object CMOVNA_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNA_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNA_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }
}
