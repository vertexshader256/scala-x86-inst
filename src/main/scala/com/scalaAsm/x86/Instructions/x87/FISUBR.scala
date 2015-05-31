package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Subtract
// Category: general/arith

trait FISUBR extends InstructionDefinition {
  val mnemonic = "FISUBR"
}

object FISUBR extends OneOperand[FISUBR] with FISUBRImpl

trait FISUBRImpl extends FISUBR {
  implicit object FISUBR_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDA /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object FISUBR_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDE /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
