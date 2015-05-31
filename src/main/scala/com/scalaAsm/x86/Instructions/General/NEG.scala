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
  implicit object NEG_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 3
    val format = RmFormat
    val hasRMByte = true
  }

  implicit object NEG_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 3
    val format = RmFormat
    val hasRMByte = true
  }

  implicit object NEG_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 3
    val format = RmFormat
    val hasRMByte = true
  }

  implicit object NEG_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 3
    override def prefix = REX.W(true)
    val format = RmFormat
    val hasRMByte = true
  }
}
