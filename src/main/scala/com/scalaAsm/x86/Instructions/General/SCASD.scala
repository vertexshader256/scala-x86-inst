package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

object SCASD extends InstructionDefinition("SCASD") with SCASDImpl

trait SCASDImpl {
  implicit object SCASD_0 extends SCASD._0 {
    val opcode: OneOpcode = 0xAF
    override def hasImplicitOperand = true
  }
}
