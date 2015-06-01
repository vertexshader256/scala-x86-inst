package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not below/above or equal/not carry (CF=0)
// Category: general/datamov

trait CMOVNB extends InstructionDefinition {
  val mnemonic = "CMOVNB"
}

object CMOVNB extends TwoOperands[CMOVNB] with CMOVNBImpl

trait CMOVNBImpl extends CMOVNB {
  implicit object CMOVNB_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    val format = RegRmFormat
  }

  implicit object CMOVNB_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    val format = RegRmFormat
  }

  implicit object CMOVNB_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x43) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
