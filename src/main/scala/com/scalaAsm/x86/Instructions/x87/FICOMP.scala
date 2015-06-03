package com.scalaAsm.x86
package Instructions
package x87

// Description: Compare Integer and Pop
// Category: general/compar

trait FICOMP extends InstructionDefinition {
  val mnemonic = "FICOMP"
}

object FICOMP extends OneOperand[FICOMP] with FICOMPImpl

trait FICOMPImpl extends FICOMP {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
