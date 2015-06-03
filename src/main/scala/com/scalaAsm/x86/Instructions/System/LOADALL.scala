package com.scalaAsm.x86
package Instructions
package System

// Description: Load All of the CPU Registers
// Category: general/branch

trait LOADALL extends InstructionDefinition {
  val mnemonic = "LOADALL"
}

object LOADALL extends ZeroOperands[LOADALL] with LOADALLImpl

trait LOADALLImpl extends LOADALL {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x05)
        override def hasImplicitOperand = true
  }
}
