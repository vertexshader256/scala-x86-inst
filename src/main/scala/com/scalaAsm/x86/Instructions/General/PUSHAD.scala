package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push All General-Purpose Registers
// Category: general/stack

trait PUSHAD extends InstructionDefinition {
  val mnemonic = "PUSHAD"
}

object PUSHAD extends PUSHAD with ZeroOperands[PUSHAD] with PUSHADImpl

trait PUSHADImpl {
  self: PUSHAD =>
  implicit object PUSHAD_0 extends _0 {
    val opcode: OneOpcode = 0x60
    override def hasImplicitOperand = true
  }
}
