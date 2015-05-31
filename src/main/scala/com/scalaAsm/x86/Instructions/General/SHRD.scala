package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Double Precision Shift Right
// Category: general/shftrot

trait SHRD extends InstructionDefinition {
  val mnemonic = "SHRD"
}

object SHRD extends TwoOperands[SHRD] with SHRDImpl

trait SHRDImpl extends SHRD {
  implicit object SHRD_0 extends _2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xAD) /r
    val explicitFormat = new MemRegFormat{}
    override def hasImplicitOperand = true
  }

  implicit object SHRD_1 extends _2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xAD) /r
    val explicitFormat = new MemRegFormat{}
    override def hasImplicitOperand = true
  }

  implicit object SHRD_2 extends _2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xAD) /r
    override def prefix = REX.W(true)
    val explicitFormat = new MemRegFormat{}
    override def hasImplicitOperand = true
  }
}
