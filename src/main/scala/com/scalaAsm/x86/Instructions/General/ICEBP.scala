package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait ICEBP extends InstructionDefinition {
  val mnemonic = "ICEBP"
}

object ICEBP extends ICEBP with ICEBPImpl

trait ICEBPImpl {
  self: ICEBP =>
  implicit object ICEBP_0 extends _0 {
    val opcode: OneOpcode = 0xF1
    override def hasImplicitOperand = true
  }
}
