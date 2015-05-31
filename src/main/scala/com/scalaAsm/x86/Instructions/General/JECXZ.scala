package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if eCX register is 0
// Category: general/branch/cond

trait JECXZ extends InstructionDefinition {
  val mnemonic = "JECXZ"
}

object JECXZ extends OneOperand[JECXZ] with JECXZImpl

trait JECXZImpl extends JECXZ {
  implicit object JECXZ_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE3
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }
}
