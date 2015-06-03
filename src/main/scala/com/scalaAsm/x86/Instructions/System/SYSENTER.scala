package com.scalaAsm.x86
package Instructions
package System

// Description: Fast System Call
// Category: general/branch

trait SYSENTER extends InstructionDefinition {
  val mnemonic = "SYSENTER"
}

object SYSENTER extends ZeroOperands[SYSENTER] with SYSENTERImpl

trait SYSENTERImpl extends SYSENTER {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x34)
        override def hasImplicitOperand = true
  }
}
