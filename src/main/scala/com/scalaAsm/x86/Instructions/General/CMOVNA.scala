package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - below or equal/not above (CF=1 AND ZF=1)
// Category: general/datamov

object CMOVNA extends InstructionDefinition("CMOVNA") with CMOVNAImpl

trait CMOVNAImpl {
  implicit object CMOVNA_0 extends CMOVNA._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
  }

  implicit object CMOVNA_1 extends CMOVNA._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVNA_2 extends CMOVNA._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def prefix = REX.W(true)
  }
}
