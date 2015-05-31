package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/datamov

trait CMOVNLE extends InstructionDefinition {
  val mnemonic = "CMOVNLE"
}

object CMOVNLE extends TwoOperands[CMOVNLE] with CMOVNLEImpl

trait CMOVNLEImpl extends CMOVNLE {
  implicit object CMOVNLE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNLE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNLE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }
}
