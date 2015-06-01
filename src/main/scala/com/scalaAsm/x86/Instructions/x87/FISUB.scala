package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Subtract
// Category: general/arith

trait FISUB extends InstructionDefinition {
  val mnemonic = "FISUB"
}

object FISUB extends OneOperand[FISUB] with FISUBImpl

trait FISUBImpl extends FISUB {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
