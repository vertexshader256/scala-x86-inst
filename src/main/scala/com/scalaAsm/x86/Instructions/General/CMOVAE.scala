package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not below/above or equal/not carry (CF=0)
// Category: general/datamov

trait CMOVAE extends InstructionDefinition {
  val mnemonic = "CMOVAE"
}

object CMOVAE extends TwoOperands[CMOVAE] with CMOVAEImpl

trait CMOVAEImpl extends CMOVAE {
  implicit object CMOVAE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    val format = RegRmFormat
  }

  implicit object CMOVAE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    val format = RegRmFormat
  }

  implicit object CMOVAE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
