package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Local Descriptor Table Register
// Category: general

trait SLDT extends InstructionDefinition {
  val mnemonic = "SLDT"
}

object SLDT extends SLDT with SLDTImpl

trait SLDTImpl {
  self: SLDT =>
  implicit object SLDT_0 extends _1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def hasImplicitOperand = true
  }

  implicit object SLDT_1 extends _1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def hasImplicitOperand = true
  }

  implicit object SLDT_2 extends _1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def hasImplicitOperand = true
  }

  implicit object SLDT_3 extends _1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
