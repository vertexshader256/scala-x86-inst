package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unordered Compare Floating Point Values and Pop
// Category: general/compar

trait FUCOMP extends InstructionDefinition {
  val mnemonic = "FUCOMP"
}

object FUCOMP extends FUCOMP with ZeroOperands[FUCOMP] with FUCOMPImpl

trait FUCOMPImpl {
  self: FUCOMP =>
  implicit object FUCOMP_0 extends _0 {
    val opcode: OneOpcode = 0xDD /+ 5
    override def hasImplicitOperand = true
  }
}
