package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Signed Multiply
// Category: general/arith/binary

trait IMUL extends InstructionDefinition {
  val mnemonic = "IMUL"
}

object IMUL extends OneOperand[IMUL] with TwoOperands[IMUL] with IMULImpl

trait IMULLow extends IMUL {
  implicit object IMUL_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object IMUL_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object IMUL_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object IMUL_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 5
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}

trait IMULImpl extends IMULLow {
  implicit object IMUL_4 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xAF) /r
  }

  implicit object IMUL_5 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xAF) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object IMUL_6 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xAF) /r
    override def prefix = REX.W(true)
  }
}
