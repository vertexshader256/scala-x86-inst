package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Scan Reverse
// Category: general/bit

trait BSR extends InstructionDefinition {
  val mnemonic = "BSR"
}

object BSR extends TwoOperands[BSR] with BSRImpl

trait BSRImpl extends BSR {
  implicit object BSR_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBD) /r
  }

  implicit object BSR_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xBD) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object BSR_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xBD) /r
    override def prefix = REX.W(true)
  }
}
