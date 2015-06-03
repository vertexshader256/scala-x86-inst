package com.scalaAsm.x86
package Instructions
package x87

// Description: Store Integer and Pop
// Category: general/datamov

trait FISTP extends InstructionDefinition {
  val mnemonic = "FISTP"
}

object FISTP extends OneOperand[FISTP] with FISTPImpl

trait FISTPImpl extends FISTP {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDB /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDF /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
