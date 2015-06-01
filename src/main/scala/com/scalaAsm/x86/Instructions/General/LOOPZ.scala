package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0 and ZF=1
// Category: general/branch/cond

trait LOOPZ extends InstructionDefinition {
  val mnemonic = "LOOPZ"
}

object LOOPZ extends OneOperand[LOOPZ] with LOOPZImpl

trait LOOPZImpl extends LOOPZ {
  implicit object LOOPZ_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE1
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
