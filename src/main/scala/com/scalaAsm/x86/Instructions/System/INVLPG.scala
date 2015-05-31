package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Invalidate TLB Entry
// Category: general

trait INVLPG extends InstructionDefinition {
  val mnemonic = "INVLPG"
}

object INVLPG extends OneOperand[INVLPG] with INVLPGImpl

trait INVLPGImpl extends INVLPG {
  implicit object INVLPG_0 extends _1[m] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
    val explicitFormat = new RmFormat{}
  }
}
