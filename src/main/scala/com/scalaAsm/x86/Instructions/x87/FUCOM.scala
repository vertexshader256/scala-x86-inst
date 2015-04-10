package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unordered Compare Floating Point Values
// Category: general/compar

trait FUCOM extends InstructionDefinition {
  val mnemonic = "FUCOM"
}

object FUCOM extends FUCOM with ZeroOperands[FUCOM] with FUCOMImpl

trait FUCOMImpl {
  self: FUCOM =>
  implicit object FUCOM_0 extends _0 {
    val opcode: OneOpcode = 0xDD /+ 4
    override def hasImplicitOperand = true
  }
}
