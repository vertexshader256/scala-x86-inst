package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSQ extends InstructionDefinition {
  val mnemonic = "CMPSQ"
}

object CMPSQ extends CMPSQ with ZeroOperands[CMPSQ] with CMPSQImpl

trait CMPSQImpl {
  self: CMPSQ =>
  implicit object CMPSQ_0 extends _0 {
    val opcode: OneOpcode = 0xA7
    override def hasImplicitOperand = true
  }
}
