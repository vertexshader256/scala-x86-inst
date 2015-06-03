package com.scalaAsm.x86
package Instructions
package General

// Description: Interrupt Return
// Category: general/breakstack

trait IRETQ extends InstructionDefinition {
  val mnemonic = "IRETQ"
}

object IRETQ extends ZeroOperands[IRETQ] with IRETQImpl

trait IRETQImpl extends IRETQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xCF
        override def hasImplicitOperand = true
  }
}
