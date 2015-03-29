package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/datamov

trait CMOVNLE extends InstructionDefinition {
  val mnemonic = "CMOVNLE"
}

object CMOVNLE extends CMOVNLE with CMOVNLEImpl

trait CMOVNLEImpl {
  self: CMOVNLE =>
  implicit object CMOVNLE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
  }

  implicit object CMOVNLE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVNLE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4F) /r
    override def prefix = REX.W(true)
  }
}
