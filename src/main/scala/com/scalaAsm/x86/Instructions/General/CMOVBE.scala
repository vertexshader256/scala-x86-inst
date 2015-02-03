package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - below or equal/not above (CF=1 AND ZF=1)
// Category: general/datamov

object CMOVBE extends InstructionDefinition("CMOVBE") with CMOVBEImpl

trait CMOVBEImpl {
  implicit object CMOVBE_0 extends CMOVBE._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
  }

  implicit object CMOVBE_1 extends CMOVBE._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVBE_2 extends CMOVBE._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def prefix = REX.W(true)
  }
}
