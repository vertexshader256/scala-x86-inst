package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if eCX register is 0
// Category: general/branch/cond

trait JCXZ extends InstructionDefinition {
  val mnemonic = "JCXZ"
}

object JCXZ extends OneOperand[JCXZ] with JCXZImpl

trait JCXZImpl extends JCXZ {
  implicit object JCXZ_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE3
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }
}
