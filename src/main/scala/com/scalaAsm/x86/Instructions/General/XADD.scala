package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Exchange and Add
// Category: general/datamovarith/binary

object XADD extends InstructionDefinition("XADD") with XADDImpl

trait XADDImpl {
  implicit object XADD_0 extends XADD._2[rm8, r8] {
    val opcode: TwoOpcodes = (0x0F, 0xC0) /r
  }

  implicit object XADD_1 extends XADD._2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
  }

  implicit object XADD_2 extends XADD._2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object XADD_3 extends XADD._2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    override def prefix = REX.W(true)
  }
}
