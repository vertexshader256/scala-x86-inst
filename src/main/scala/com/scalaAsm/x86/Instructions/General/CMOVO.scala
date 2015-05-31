package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - overflow (OF=1)
// Category: general/datamov

trait CMOVO extends InstructionDefinition {
  val mnemonic = "CMOVO"
}

object CMOVO extends TwoOperands[CMOVO] with CMOVOImpl

trait CMOVOImpl extends CMOVO {
  implicit object CMOVO_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x40) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVO_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x40) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVO_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x40) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}
