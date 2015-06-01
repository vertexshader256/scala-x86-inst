package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unsigned Divide
// Category: general/arith/binary

trait DIV extends InstructionDefinition {
  val mnemonic = "DIV"
}

object DIV extends OneOperand[DIV] with DIVImpl

trait DIVImpl extends DIV {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 6
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
