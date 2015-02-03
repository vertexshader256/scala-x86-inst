package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare and Exchange
// Category: general/datamovarith/binary

object CMPXCHG extends InstructionDefinition("CMPXCHG") with CMPXCHGImpl

trait CMPXCHGImpl {
  implicit object CMPXCHG_0 extends CMPXCHG._2[rm8, r8] {
    val opcode: TwoOpcodes = (0x0F, 0xB0) /r
    override def hasImplicitOperand = true
  }

  implicit object CMPXCHG_1 extends CMPXCHG._2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xB1) /r
    override def hasImplicitOperand = true
  }

  implicit object CMPXCHG_2 extends CMPXCHG._2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xB1) /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
    override def hasImplicitOperand = true
  }

  implicit object CMPXCHG_3 extends CMPXCHG._2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xB1) /r
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
