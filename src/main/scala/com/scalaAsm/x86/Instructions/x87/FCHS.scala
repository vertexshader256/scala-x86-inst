package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Change Sign
// Category: general/arith

trait FCHS extends InstructionDefinition {
  val mnemonic = "FCHS"
}

object FCHS extends ZeroOperands[FCHS] with FCHSImpl

trait FCHSImpl extends FCHS {
  implicit object FCHS_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
