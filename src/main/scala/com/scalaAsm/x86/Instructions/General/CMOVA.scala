package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not below or equal/above (CF=0 AND ZF=0)
// Category: general/datamov

object CMOVA extends InstructionDefinition("CMOVA") with CMOVAImpl

trait CMOVAImpl {
  implicit object CMOVA_0 extends CMOVA._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
  }

  implicit object CMOVA_1 extends CMOVA._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVA_2 extends CMOVA._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    override def prefix = REX.W(true)
  }
}
