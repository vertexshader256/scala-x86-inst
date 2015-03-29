package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

trait CMOVLE extends InstructionDefinition {
  val mnemonic = "CMOVLE"
}

object CMOVLE extends CMOVLE with CMOVLEImpl

trait CMOVLEImpl {
  self: CMOVLE =>
  implicit object CMOVLE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4E) /r
  }

  implicit object CMOVLE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4E) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVLE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4E) /r
    override def prefix = REX.W(true)
  }
}
