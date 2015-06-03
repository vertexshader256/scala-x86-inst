package com.scalaAsm.x86
package Instructions
package General

// Description: Decrement count; Jump short if count!=0 and ZF=0
// Category: general/branch/cond

trait LOOPNZ extends InstructionDefinition {
  val mnemonic = "LOOPNZ"
}

object LOOPNZ extends OneOperand[LOOPNZ] with LOOPNZImpl

trait LOOPNZImpl extends LOOPNZ {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0xE0
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
