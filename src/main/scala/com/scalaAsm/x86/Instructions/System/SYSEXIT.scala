package com.scalaAsm.x86
package Instructions
package System

// Description: Fast Return from Fast System Call
// Category: general/branch/trans

trait SYSEXIT extends InstructionDefinition {
  val mnemonic = "SYSEXIT"
}

object SYSEXIT extends ZeroOperands[SYSEXIT] with SYSEXITImpl

trait SYSEXITImpl extends SYSEXIT {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x35)
        override def hasImplicitOperand = true
  }
}
