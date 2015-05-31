package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - below or equal/not above (CF=1 AND ZF=1)
// Category: general/datamov

trait CMOVBE extends InstructionDefinition {
  val mnemonic = "CMOVBE"
}

object CMOVBE extends TwoOperands[CMOVBE] with CMOVBEImpl

trait CMOVBEImpl extends CMOVBE {
  implicit object CMOVBE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVBE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVBE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x46) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}
