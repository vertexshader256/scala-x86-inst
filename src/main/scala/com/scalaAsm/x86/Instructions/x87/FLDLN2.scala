package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant loge2
// Category: general/ldconst

trait FLDLN2 extends InstructionDefinition {
  val mnemonic = "FLDLN2"
}

object FLDLN2 extends ZeroOperands[FLDLN2] with FLDLN2Impl

trait FLDLN2Impl extends FLDLN2 {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
  }
}
