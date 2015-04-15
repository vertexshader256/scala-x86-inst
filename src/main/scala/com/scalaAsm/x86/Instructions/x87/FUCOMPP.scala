package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unordered Compare Floating Point Values and Pop Twice
// Category: general/compar

trait FUCOMPP extends InstructionDefinition {
  val mnemonic = "FUCOMPP"
}

object FUCOMPP extends ZeroOperands[FUCOMPP] with FUCOMPPImpl

trait FUCOMPPImpl extends FUCOMPP {
  implicit object FUCOMPP_0 extends _0 {
    val opcode: OneOpcode = 0xDA /+ 5
    override def hasImplicitOperand = true
  }
}
