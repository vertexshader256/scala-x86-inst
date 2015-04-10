package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Subtract
// Category: general/arith

trait FSUBR extends InstructionDefinition {
  val mnemonic = "FSUBR"
}

object FSUBR extends FSUBR with OneOperand[FSUBR] with FSUBRImpl

trait FSUBRImpl {
  self: FSUBR =>
  implicit object FSUBR_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object FSUBR_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDC /+ 5
    override def hasImplicitOperand = true
  }
}
