package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not sign (SF=0)
// Category: general/datamov

object CMOVNS extends InstructionDefinition("CMOVNS") with CMOVNSImpl

trait CMOVNSImpl {
  implicit object CMOVNS_0 extends CMOVNS._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
  }

  implicit object CMOVNS_1 extends CMOVNS._2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVNS_2 extends CMOVNS._2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    override def prefix = REX.W(true)
  }
}
