package com.scalaAsm.x86
package Instructions
package x87

// Description: Load Floating Point Value
// Category: general/datamov

trait FLD extends InstructionDefinition {
  val mnemonic = "FLD"
}

object FLD extends OneOperand[FLD] with FLDImpl

trait FLDImpl extends FLD {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD9 /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDD /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
