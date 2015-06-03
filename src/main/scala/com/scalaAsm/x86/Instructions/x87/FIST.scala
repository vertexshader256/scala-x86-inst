package com.scalaAsm.x86
package Instructions
package x87

// Description: Store Integer
// Category: general/datamov

trait FIST extends InstructionDefinition {
  val mnemonic = "FIST"
}

object FIST extends OneOperand[FIST] with FISTImpl

trait FISTImpl extends FIST {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDB /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDF /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
