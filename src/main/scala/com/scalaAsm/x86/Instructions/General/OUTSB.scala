package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

trait OUTSB extends InstructionDefinition {
  val mnemonic = "OUTSB"
}

object OUTSB extends OUTSB with ZeroOperands[OUTSB] with OUTSBImpl

trait OUTSBImpl {
  self: OUTSB =>
  implicit object OUTSB_0 extends _0 {
    val opcode: OneOpcode = 0x6E
    override def hasImplicitOperand = true
  }
}
