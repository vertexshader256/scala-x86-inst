package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0 and ZF=0
// Category: general/branch/cond

trait LOOPNZ extends InstructionDefinition {
  val mnemonic = "LOOPNZ"
}

object LOOPNZ extends OneOperand[LOOPNZ] with LOOPNZImpl

trait LOOPNZImpl extends LOOPNZ {
  implicit object LOOPNZ_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE0
    override def hasImplicitOperand = true
  }
}
