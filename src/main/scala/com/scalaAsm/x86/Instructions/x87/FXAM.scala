package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Examine
// Category: general

trait FXAM extends InstructionDefinition {
  val mnemonic = "FXAM"
}

object FXAM extends ZeroOperands[FXAM] with FXAMImpl

trait FXAMImpl extends FXAM {
  implicit object FXAM_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
