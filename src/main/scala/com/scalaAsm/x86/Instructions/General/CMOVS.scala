package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - sign (SF=1)
// Category: general/datamov

object CMOVS extends InstructionDefinition("CMOVS") with CMOVSImpl

trait CMOVSImpl {
  implicit object CMOVS_0 extends CMOVS._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
  }

  implicit object CMOVS_1 extends CMOVS._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVS_2 extends CMOVS._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    override def prefix = REX.W(true)
  }
}
