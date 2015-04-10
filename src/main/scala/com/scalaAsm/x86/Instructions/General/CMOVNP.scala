package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not parity/parity odd
// Category: general/datamov

trait CMOVNP extends InstructionDefinition {
  val mnemonic = "CMOVNP"
}

object CMOVNP extends CMOVNP with TwoOperands[CMOVNP] with CMOVNPImpl

trait CMOVNPImpl {
  self: CMOVNP =>
  implicit object CMOVNP_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
  }

  implicit object CMOVNP_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }

  implicit object CMOVNP_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    override def prefix = REX.W(true)
  }
}
