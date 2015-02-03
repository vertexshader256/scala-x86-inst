package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Subtract and Pop
// Category: general/arith

object FSUBRP extends InstructionDefinition("FSUBRP") with FSUBRPImpl

trait FSUBRPImpl {
  implicit object FSUBRP_0 extends FSUBRP._0 {
    val opcode: OneOpcode = 0xDE /+ 4
    override def hasImplicitOperand = true
  }
}
