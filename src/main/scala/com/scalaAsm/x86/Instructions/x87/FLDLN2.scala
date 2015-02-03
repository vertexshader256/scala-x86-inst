package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant loge2
// Category: general/ldconst

object FLDLN2 extends InstructionDefinition("FLDLN2") with FLDLN2Impl

trait FLDLN2Impl {
  implicit object FLDLN2_0 extends FLDLN2._0 {
    val opcode: OneOpcode = 0xD9 /+ 5
    override def hasImplicitOperand = true
  }
}
