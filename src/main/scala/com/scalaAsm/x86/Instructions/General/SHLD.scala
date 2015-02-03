package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Double Precision Shift Left
// Category: general/shftrot

object SHLD extends InstructionDefinition("SHLD") with SHLDImpl

trait SHLDImpl {
  implicit object SHLD_0 extends SHLD._2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xA5) /r
    override def hasImplicitOperand = true
  }

  implicit object SHLD_1 extends SHLD._2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xA5) /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
    override def hasImplicitOperand = true
  }

  implicit object SHLD_2 extends SHLD._2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xA5) /r
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
