package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

trait OUTSD extends InstructionDefinition {
  val mnemonic = "OUTSD"
}

object OUTSD extends OUTSD with OUTSDImpl

trait OUTSDImpl {
  self: OUTSD =>
  implicit object OUTSD_0 extends _0 {
    val opcode: OneOpcode = 0x6F
    override def hasImplicitOperand = true
  }
}
