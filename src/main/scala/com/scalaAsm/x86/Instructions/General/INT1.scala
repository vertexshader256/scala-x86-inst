package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait INT1 extends InstructionDefinition {
  val mnemonic = "INT1"
}

object INT1 extends INT1 with ZeroOperands[INT1] with INT1Impl

trait INT1Impl {
  self: INT1 =>
  implicit object INT1_0 extends _0 {
    val opcode: OneOpcode = 0xF1
    override def hasImplicitOperand = true
  }
}
