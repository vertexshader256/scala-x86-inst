package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Exchange Register Contents
// Category: general/datamov

trait FXCH extends InstructionDefinition {
  val mnemonic = "FXCH"
}

object FXCH extends ZeroOperands[FXCH] with FXCHImpl

trait FXCHImpl extends FXCH {
  implicit object FXCH_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 1
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
