package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not zero/not equal (ZF=1)
// Category: general/datamov

trait CMOVNZ extends InstructionDefinition {
  val mnemonic = "CMOVNZ"
}

object CMOVNZ extends TwoOperands[CMOVNZ] with CMOVNZImpl

trait CMOVNZImpl extends CMOVNZ {
  implicit object CMOVNZ_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVNZ_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVNZ_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}
