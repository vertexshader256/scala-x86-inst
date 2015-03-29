package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Make Stack Frame for Procedure Parameters
// Category: general/stack

trait ENTER extends InstructionDefinition {
  val mnemonic = "ENTER"
}

object ENTER extends ENTER with ENTERImpl

trait ENTERImpl {
  self: ENTER =>
  implicit object ENTER_0 extends _2[imm16, imm8] {
    val opcode: OneOpcode = 0xC8
    override def hasImplicitOperand = true
  }
}
