package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Subtract
// Category: general/arith

object FISUBR extends InstructionDefinition("FISUBR") with FISUBRImpl

trait FISUBRImpl {
  implicit object FISUBR_0 extends FISUBR._1[m32] {
    val opcode: OneOpcode = 0xDA /+ 5
    override def hasImplicitOperand = true
  }

  implicit object FISUBR_1 extends FISUBR._1[m16] {
    val opcode: OneOpcode = 0xDE /+ 5
    override def hasImplicitOperand = true
  }
}
