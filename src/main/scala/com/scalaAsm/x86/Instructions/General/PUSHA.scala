package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push All General-Purpose Registers
// Category: general/stack

trait PUSHA extends InstructionDefinition {
  val mnemonic = "PUSHA"
}

object PUSHA extends PUSHA with ZeroOperands[PUSHA] with PUSHAImpl

trait PUSHAImpl {
  self: PUSHA =>
  implicit object PUSHA_0 extends _0 {
    val opcode: OneOpcode = 0x60
    override def hasImplicitOperand = true
  }
}
