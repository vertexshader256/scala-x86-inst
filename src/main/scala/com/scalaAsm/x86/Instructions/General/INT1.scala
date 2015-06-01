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

object INT1 extends ZeroOperands[INT1] with INT1Impl

trait INT1Impl extends INT1 {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xF1
        override def hasImplicitOperand = true
  }
}
