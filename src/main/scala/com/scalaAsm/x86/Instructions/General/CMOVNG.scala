package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

object CMOVNG extends InstructionDefinition("CMOVNG") with CMOVNGImpl

trait CMOVNGImpl {
  implicit object CMOVNG_0 extends CMOVNG._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4E) /r
  }

  implicit object CMOVNG_1 extends CMOVNG._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4E) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVNG_2 extends CMOVNG._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4E) /r
    override def prefix = REX.W(true)
  }
}
