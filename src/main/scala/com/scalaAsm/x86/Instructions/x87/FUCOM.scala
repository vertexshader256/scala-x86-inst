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

object FUCOM extends ZeroOperands[FUCOM] with FUCOMImpl

trait FUCOMImpl extends FUCOM {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDD /+ 4
        override def hasImplicitOperand = true
  }
}
