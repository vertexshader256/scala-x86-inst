package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

trait SCASQ extends InstructionDefinition {
  val mnemonic = "SCASQ"
}

object SCASQ extends SCASQ with ZeroOperands[SCASQ] with SCASQImpl

trait SCASQImpl {
  self: SCASQ =>
  implicit object SCASQ_0 extends _0 {
    val opcode: OneOpcode = 0xAF
    override def hasImplicitOperand = true
  }
}
