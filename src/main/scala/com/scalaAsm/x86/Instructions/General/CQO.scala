package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert
// Category: general/conver

trait CQO extends InstructionDefinition {
  val mnemonic = "CQO"
}

object CQO extends CQO with ZeroOperands[CQO] with CQOImpl

trait CQOImpl {
  self: CQO =>
  implicit object CQO_0 extends _0 {
    val opcode: OneOpcode = 0x99
    override def hasImplicitOperand = true
  }
}
