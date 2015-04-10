package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

trait SCASW extends InstructionDefinition {
  val mnemonic = "SCASW"
}

object SCASW extends SCASW with ZeroOperands[SCASW] with SCASWImpl

trait SCASWImpl {
  self: SCASW =>
  implicit object SCASW_0 extends _0 {
    val opcode: OneOpcode = 0xAF
    override def hasImplicitOperand = true
  }
}
