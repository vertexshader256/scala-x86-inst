package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not parity/parity odd
// Category: general/datamov

trait CMOVPO extends InstructionDefinition {
  val mnemonic = "CMOVPO"
}

object CMOVPO extends TwoOperands[CMOVPO] with CMOVPOImpl

trait CMOVPOImpl extends CMOVPO {
  implicit object CMOVPO_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    val format = RegRmFormat
  }

  implicit object CMOVPO_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    val format = RegRmFormat
  }

  implicit object CMOVPO_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
