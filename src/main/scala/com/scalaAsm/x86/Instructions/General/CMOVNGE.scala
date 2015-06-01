package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - less/not greater (SF!=OF)
// Category: general/datamov

trait CMOVNGE extends InstructionDefinition {
  val mnemonic = "CMOVNGE"
}

object CMOVNGE extends TwoOperands[CMOVNGE] with CMOVNGEImpl

trait CMOVNGEImpl extends CMOVNGE {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4C) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
