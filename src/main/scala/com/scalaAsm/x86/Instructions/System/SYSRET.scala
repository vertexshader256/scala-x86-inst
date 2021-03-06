package com.scalaAsm.x86
package Instructions
package System

// Description: Return From Fast System Call
// Category: general/branch/trans

trait SYSRET extends InstructionDefinition {
  val mnemonic = "SYSRET"
}

object SYSRET extends ZeroOperands[SYSRET] with SYSRETImpl

trait SYSRETImpl extends SYSRET {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x07)
        override def hasImplicitOperand = true
  }
}
