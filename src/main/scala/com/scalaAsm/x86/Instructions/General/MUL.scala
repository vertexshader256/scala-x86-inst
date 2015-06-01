package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unsigned Multiply
// Category: general/arith/binary

trait MUL extends InstructionDefinition {
  val mnemonic = "MUL"
}

object MUL extends OneOperand[MUL] with MULImpl

trait MULImpl extends MUL {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 4
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
