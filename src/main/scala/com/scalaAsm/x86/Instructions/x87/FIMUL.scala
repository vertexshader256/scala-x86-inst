package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Multiply
// Category: general/arith

trait FIMUL extends InstructionDefinition {
  val mnemonic = "FIMUL"
}

object FIMUL extends FIMUL with OneOperand[FIMUL] with FIMULImpl

trait FIMULImpl {
  self: FIMUL =>
  implicit object FIMUL_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDA /+ 1
    override def hasImplicitOperand = true
  }

  implicit object FIMUL_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDE /+ 1
    override def hasImplicitOperand = true
  }
}
