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

object SLDT extends OneOperand[SLDT] with SLDTImpl

trait SLDTImpl extends SLDT {
  implicit object SLDT_0 extends _1[m16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SLDT_1 extends _1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SLDT_2 extends _1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object SLDT_3 extends _1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 0
    override def prefix = REX.W(true)
    val format = RegFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
