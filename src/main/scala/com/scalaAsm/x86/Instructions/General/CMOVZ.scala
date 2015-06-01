package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - zero/equal (ZF=0)
// Category: general/datamov

trait CMOVZ extends InstructionDefinition {
  val mnemonic = "CMOVZ"
}

object CMOVZ extends TwoOperands[CMOVZ] with CMOVZImpl

trait CMOVZImpl extends CMOVZ {
  implicit object CMOVZ_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x44) /r
    val format = RegRmFormat
  }

  implicit object CMOVZ_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x44) /r
    val format = RegRmFormat
  }

  implicit object CMOVZ_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x44) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
