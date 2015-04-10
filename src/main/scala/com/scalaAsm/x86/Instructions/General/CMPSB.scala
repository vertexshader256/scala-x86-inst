package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSB extends InstructionDefinition {
  val mnemonic = "CMPSB"
}

object CMPSB extends CMPSB with ZeroOperands[CMPSB] with CMPSBImpl

trait CMPSBImpl {
  self: CMPSB =>
  implicit object CMPSB_0 extends _0 {
    val opcode: OneOpcode = 0xA6
    override def hasImplicitOperand = true
  }
}
