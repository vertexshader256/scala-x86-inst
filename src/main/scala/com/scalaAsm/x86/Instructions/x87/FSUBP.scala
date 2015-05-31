package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Subtract and Pop
// Category: general/arith

trait FSUBP extends InstructionDefinition {
  val mnemonic = "FSUBP"
}

object FSUBP extends ZeroOperands[FSUBP] with FSUBPImpl

trait FSUBPImpl extends FSUBP {
  implicit object FSUBP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 5
        override def hasImplicitOperand = true
  }
}
