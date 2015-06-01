package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Double Precision Shift Left
// Category: general/shftrot

trait SHLD extends InstructionDefinition {
  val mnemonic = "SHLD"
}

object SHLD extends TwoOperands[SHLD] with SHLDImpl

trait SHLDImpl extends SHLD {
  implicit object _0 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xA5) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xA5) /r
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xA5) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    override def hasImplicitOperand = true
  }
}
