package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LES extends InstructionDefinition {
  val mnemonic = "LES"
}

object LES extends TwoOperands[LES] with LESImpl

trait LESImpl extends LES {
  implicit object LES_0 extends _2[r16, m] {
    val opcode: OneOpcode = 0xC4 /r
    override def hasImplicitOperand = true
  }

  implicit object LES_1 extends _2[r32, m] {
    val opcode: OneOpcode = 0xC4 /r
    override def hasImplicitOperand = true
  }
}
