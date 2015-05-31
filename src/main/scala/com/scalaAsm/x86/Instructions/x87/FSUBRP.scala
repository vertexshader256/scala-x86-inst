package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Subtract and Pop
// Category: general/arith

trait FSUBRP extends InstructionDefinition {
  val mnemonic = "FSUBRP"
}

object FSUBRP extends ZeroOperands[FSUBRP] with FSUBRPImpl

trait FSUBRPImpl extends FSUBRP {
  implicit object FSUBRP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 4
        override def hasImplicitOperand = true
  }
}
