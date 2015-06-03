package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if eCX register is 0
// Category: general/branch/cond

trait JECXZ extends InstructionDefinition {
  val mnemonic = "JECXZ"
}

object JECXZ extends OneOperand[JECXZ] with JECXZImpl

trait JECXZImpl extends JECXZ {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0xE3
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
