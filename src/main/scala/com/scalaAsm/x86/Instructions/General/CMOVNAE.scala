package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - below/not above or equal/carry (CF=1)
// Category: general/datamov

trait CMOVNAE extends InstructionDefinition {
  val mnemonic = "CMOVNAE"
}

object CMOVNAE extends TwoOperands[CMOVNAE] with CMOVNAEImpl

trait CMOVNAEImpl extends CMOVNAE {
  implicit object CMOVNAE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    val format = RegRmFormat
  }

  implicit object CMOVNAE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    val format = RegRmFormat
  }

  implicit object CMOVNAE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
