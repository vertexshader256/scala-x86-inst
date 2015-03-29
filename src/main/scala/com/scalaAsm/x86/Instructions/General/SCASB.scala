package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

trait SCASB extends InstructionDefinition {
  val mnemonic = "SCASB"
}

object SCASB extends SCASB with SCASBImpl

trait SCASBImpl {
  self: SCASB =>
  implicit object SCASB_0 extends _0 {
    val opcode: OneOpcode = 0xAE
    override def hasImplicitOperand = true
  }
}
