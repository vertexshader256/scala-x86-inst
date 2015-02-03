package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - overflow (OF=1)
// Category: general/datamov

object CMOVO extends InstructionDefinition("CMOVO") with CMOVOImpl

trait CMOVOImpl {
  implicit object CMOVO_0 extends CMOVO._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x40) /r
  }

  implicit object CMOVO_1 extends CMOVO._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x40) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVO_2 extends CMOVO._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x40) /r
    override def prefix = REX.W(true)
  }
}
