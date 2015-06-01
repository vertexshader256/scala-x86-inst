package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Multiply
// Category: general/arith

trait FMUL extends InstructionDefinition {
  val mnemonic = "FMUL"
}

object FMUL extends OneOperand[FMUL] with FMULImpl

trait FMULImpl extends FMUL {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xD8 /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m64] {
    val opcode: OneOpcode = 0xDC /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
