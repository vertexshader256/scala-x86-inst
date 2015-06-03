package com.scalaAsm.x86
package Instructions
package System

// Description: Fast System Call
// Category: general/branch

trait SYSCALL extends InstructionDefinition {
  val mnemonic = "SYSCALL"
}

object SYSCALL extends ZeroOperands[SYSCALL] with SYSCALLImpl

trait SYSCALLImpl extends SYSCALL {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x05)
        override def hasImplicitOperand = true
  }
}
