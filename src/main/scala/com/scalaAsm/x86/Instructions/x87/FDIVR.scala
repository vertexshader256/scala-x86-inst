package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Divide
// Category: general/arith

trait FDIVR extends InstructionDefinition {
  val mnemonic = "FDIVR"
}

object FDIVR extends OneOperand[FDIVR] with FDIVRImpl

trait FDIVRImpl extends FDIVR {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD8 /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDC /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
