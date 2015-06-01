package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: One's Complement Negation
// Category: general/logical

trait NOT extends InstructionDefinition {
  val mnemonic = "NOT"
}

object NOT extends OneOperand[NOT] with NOTImpl

trait NOTImpl extends NOT {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 2
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 2
    val format = RmFormat
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 2
    val format = RmFormat
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 2
    override def prefix = REX.W(true)
    val format = RmFormat
  }
}
