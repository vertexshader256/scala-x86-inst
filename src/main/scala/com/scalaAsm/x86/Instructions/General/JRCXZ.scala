package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if rCX register is 0
// Category: general/branch/cond

trait JRCXZ extends InstructionDefinition {
  val mnemonic = "JRCXZ"
}

object JRCXZ extends OneOperand[JRCXZ] with JRCXZImpl

trait JRCXZImpl extends JRCXZ {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0xE3
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
