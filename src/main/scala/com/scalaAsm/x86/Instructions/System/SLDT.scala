package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Local Descriptor Table Register
// Category: general

object SLDT extends InstructionDefinition("SLDT") with SLDTImpl

trait SLDTImpl {
  implicit object SLDT_0 extends SLDT._1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def hasImplicitOperand = true
  }

  implicit object SLDT_1 extends SLDT._1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def hasImplicitOperand = true
  }

  implicit object SLDT_2 extends SLDT._1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def hasImplicitOperand = true
  }

  implicit object SLDT_3 extends SLDT._1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
