package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not zero/not equal (ZF=1)
// Category: general/datamov

trait CMOVNE extends InstructionDefinition {
  val mnemonic = "CMOVNE"
}

object CMOVNE extends TwoOperands[CMOVNE] with CMOVNEImpl

trait CMOVNEImpl extends CMOVNE {
  implicit object CMOVNE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
  }

  implicit object CMOVNE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object CMOVNE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x45) /r
    override def prefix = REX.W(true)
  }
}
