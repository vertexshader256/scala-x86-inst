package com.scalaAsm.x86
package Instructions
package x87

// Description: Multiply
// Category: general/arith

trait FIMUL extends InstructionDefinition {
  val mnemonic = "FIMUL"
}

object FIMUL extends OneOperand[FIMUL] with FIMULImpl

trait FIMULImpl extends FIMUL {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
