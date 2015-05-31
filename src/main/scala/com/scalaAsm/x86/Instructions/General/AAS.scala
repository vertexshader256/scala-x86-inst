package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: ASCII Adjust AL After Subtraction
// Category: general/arith/decimal

trait AAS extends InstructionDefinition {
  val mnemonic = "AAS"
}

object AAS extends ZeroOperands[AAS] with AASImpl

trait AASImpl extends AAS {
  implicit object AAS_0 extends _0 {
    val opcode: OneOpcode = 0x3F
        override def hasImplicitOperand = true
  }
}
