package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

trait SCASD extends InstructionDefinition {
  val mnemonic = "SCASD"
}

object SCASD extends SCASD with SCASDImpl

trait SCASDImpl {
  self: SCASD =>
  implicit object SCASD_0 extends _0 {
    val opcode: OneOpcode = 0xAF
    override def hasImplicitOperand = true
  }
}
