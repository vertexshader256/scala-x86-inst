package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Real and Pop Twice
// Category: general/compar

trait FCOMPP extends InstructionDefinition {
  val mnemonic = "FCOMPP"
}

object FCOMPP extends FCOMPP with ZeroOperands[FCOMPP] with FCOMPPImpl

trait FCOMPPImpl {
  self: FCOMPP =>
  implicit object FCOMPP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 3
    override def hasImplicitOperand = true
  }
}
