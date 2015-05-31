package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Table Look-up Translation
// Category: general/datamov

trait XLAT extends InstructionDefinition {
  val mnemonic = "XLAT"
}

object XLAT extends ZeroOperands[XLAT] with XLATImpl

trait XLATImpl extends XLAT {
  implicit object XLAT_0 extends _0 {
    val opcode: OneOpcode = 0xD7
        override def hasImplicitOperand = true
  }
}
