package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Divide
// Category: general/arith

trait FIDIVR extends InstructionDefinition {
  val mnemonic = "FIDIVR"
}

object FIDIVR extends OneOperand[FIDIVR] with FIDIVRImpl

trait FIDIVRImpl extends FIDIVR {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 7
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
