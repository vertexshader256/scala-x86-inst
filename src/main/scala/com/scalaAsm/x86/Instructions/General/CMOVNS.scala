package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not sign (SF=0)
// Category: general/datamov

trait CMOVNS extends InstructionDefinition {
  val mnemonic = "CMOVNS"
}

object CMOVNS extends TwoOperands[CMOVNS] with CMOVNSImpl

trait CMOVNSImpl extends CMOVNS {
  implicit object CMOVNS_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVNS_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object CMOVNS_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}
