package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

trait OUTSW extends InstructionDefinition {
  val mnemonic = "OUTSW"
}

object OUTSW extends OUTSW with ZeroOperands[OUTSW] with OUTSWImpl

trait OUTSWImpl {
  self: OUTSW =>
  implicit object OUTSW_0 extends _0 {
    val opcode: OneOpcode = 0x6F
    override def hasImplicitOperand = true
  }
}
