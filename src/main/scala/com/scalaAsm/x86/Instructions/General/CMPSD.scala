package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSD extends InstructionDefinition {
  val mnemonic = "CMPSD"
}

object CMPSD extends CMPSD with CMPSDImpl

trait CMPSDImpl {
  self: CMPSD =>
  implicit object CMPSD_0 extends _0 {
    val opcode: OneOpcode = 0xA7
    override def hasImplicitOperand = true
  }
}
