package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Task-Switched Flag in CR0
// Category: general

trait CLTS extends InstructionDefinition {
  val mnemonic = "CLTS"
}

object CLTS extends CLTS with ZeroOperands[CLTS] with CLTSImpl

trait CLTSImpl {
  self: CLTS =>
  implicit object CLTS_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x06)
    override def hasImplicitOperand = true
  }
}
