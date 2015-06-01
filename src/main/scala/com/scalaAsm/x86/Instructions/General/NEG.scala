package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Two's Complement Negation
// Category: general/arith/binary

trait NEG extends InstructionDefinition {
  val mnemonic = "NEG"
}

object NEG extends OneOperand[NEG] with NEGImpl

trait NEGImpl extends NEG {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 3
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 3
    val format = RmFormat
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 3
    val format = RmFormat
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 3
    override def prefix = REX.W(true)
    val format = RmFormat
  }
}
