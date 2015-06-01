package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant log2e
// Category: general/ldconst

trait FLDL2E extends InstructionDefinition {
  val mnemonic = "FLDL2E"
}

object FLDL2E extends ZeroOperands[FLDL2E] with FLDL2EImpl

trait FLDL2EImpl extends FLDL2E {
  implicit object FLDL2E_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
  }
}
