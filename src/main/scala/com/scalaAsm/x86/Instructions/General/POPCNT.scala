package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Population Count
// Category: general/bit

trait POPCNT extends InstructionDefinition {
  val mnemonic = "POPCNT"
}

object POPCNT extends POPCNT with TwoOperands[POPCNT] with POPCNTImpl

trait POPCNTImpl {
  self: POPCNT =>
  implicit object POPCNT_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xB8) /r
  }

  implicit object POPCNT_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xB8) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object POPCNT_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xB8) /r
    override def prefix = REX.W(true)
  }
}
