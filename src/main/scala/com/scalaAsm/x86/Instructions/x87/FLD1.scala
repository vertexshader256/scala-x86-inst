package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant +1.0
// Category: general/ldconst

trait FLD1 extends InstructionDefinition {
  val mnemonic = "FLD1"
}

object FLD1 extends ZeroOperands[FLD1] with FLD1Impl

trait FLD1Impl extends FLD1 {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
  }
}
