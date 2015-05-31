package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compute y × log2x and Pop
// Category: general/trans

trait FYL2X extends InstructionDefinition {
  val mnemonic = "FYL2X"
}

object FYL2X extends ZeroOperands[FYL2X] with FYL2XImpl

trait FYL2XImpl extends FYL2X {
  implicit object FYL2X_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
  }
}
