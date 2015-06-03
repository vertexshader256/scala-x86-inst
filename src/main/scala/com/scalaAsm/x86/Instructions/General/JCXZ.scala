package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if eCX register is 0
// Category: general/branch/cond

trait JCXZ extends InstructionDefinition {
  val mnemonic = "JCXZ"
}

object JCXZ extends OneOperand[JCXZ] with JCXZImpl

trait JCXZImpl extends JCXZ {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0xE3
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
