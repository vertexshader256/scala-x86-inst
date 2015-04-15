package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store String
// Category: general/datamovstring

trait STOS extends InstructionDefinition {
  val mnemonic = "STOS"
}

object STOS extends ZeroOperands[STOS] with STOSImpl

trait STOSImpl extends STOS {
  implicit object STOS_0 extends _0 {
    val opcode: OneOpcode = 0xAA
    override def hasImplicitOperand = true
  }
}
