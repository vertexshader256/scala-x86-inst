package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVSB extends InstructionDefinition {
  val mnemonic = "MOVSB"
}

object MOVSB extends MOVSB with MOVSBImpl

trait MOVSBImpl {
  self: MOVSB =>
  implicit object MOVSB_0 extends _0 {
    val opcode: OneOpcode = 0xA4
    override def hasImplicitOperand = true
  }
}
