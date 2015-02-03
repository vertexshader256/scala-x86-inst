package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - below/not above or equal/carry (CF=1)
// Category: general/datamov

object CMOVNAE extends InstructionDefinition("CMOVNAE") with CMOVNAEImpl

trait CMOVNAEImpl {
  implicit object CMOVNAE_0 extends CMOVNAE._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
  }

  implicit object CMOVNAE_1 extends CMOVNAE._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVNAE_2 extends CMOVNAE._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x42) /r
    override def prefix = REX.W(true)
  }
}
