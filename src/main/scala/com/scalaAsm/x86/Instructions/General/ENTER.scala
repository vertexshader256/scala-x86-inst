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

object ENTER extends TwoOperands[ENTER] with ENTERImpl

trait ENTERImpl extends ENTER {
  implicit object _0 extends TwoOp[imm16, imm8] {
    val opcode: OneOpcode = 0xC8
    val format = null
    override def hasImplicitOperand = true
  }
}
