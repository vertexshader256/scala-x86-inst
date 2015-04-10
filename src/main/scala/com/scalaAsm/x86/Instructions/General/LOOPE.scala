package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0 and ZF=1
// Category: general/branch/cond

trait LOOPE extends InstructionDefinition {
  val mnemonic = "LOOPE"
}

object LOOPE extends LOOPE with OneOperand[LOOPE] with LOOPEImpl

trait LOOPEImpl {
  self: LOOPE =>
  implicit object LOOPE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE1
    override def hasImplicitOperand = true
  }
}
