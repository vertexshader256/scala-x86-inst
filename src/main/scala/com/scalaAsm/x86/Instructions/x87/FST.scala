package com.scalaAsm.x86
package Instructions
package x87

// Description: Store Floating Point Value
// Category: general/datamov

trait FST extends InstructionDefinition {
  val mnemonic = "FST"
}

object FST extends OneOperand[FST] with FSTImpl

trait FSTImpl extends FST {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD9 /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDD /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
