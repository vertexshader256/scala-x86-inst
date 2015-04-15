package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port to String
// Category: general/inoutstring

trait INSD extends InstructionDefinition {
  val mnemonic = "INSD"
}

object INSD extends ZeroOperands[INSD] with INSDImpl

trait INSDImpl extends INSD {
  implicit object INSD_0 extends _0 {
    val opcode: OneOpcode = 0x6D
    override def hasImplicitOperand = true
  }
}
