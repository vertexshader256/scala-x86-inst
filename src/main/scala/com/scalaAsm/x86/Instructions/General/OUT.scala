package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output to Port
// Category: general/inout

trait OUT extends InstructionDefinition {
  val mnemonic = "OUT"
}

object OUT extends ZeroOperands[OUT] with OneOperand[OUT] with OUTImpl

trait OUTImpl extends OUT {
  implicit object _0 extends OneOp[imm8] {
    val opcode: OneOpcode = 0xE6
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends NoOp{
    val opcode: OneOpcode = 0xEE
        override def hasImplicitOperand = true
  }
}
