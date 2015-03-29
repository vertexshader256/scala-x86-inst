package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store String
// Category: general/datamovstring

trait STOSB extends InstructionDefinition {
  val mnemonic = "STOSB"
}

object STOSB extends STOSB with STOSBImpl

trait STOSBImpl {
  self: STOSB =>
  implicit object STOSB_0 extends _0 {
    val opcode: OneOpcode = 0xAA
    override def hasImplicitOperand = true
  }
}
