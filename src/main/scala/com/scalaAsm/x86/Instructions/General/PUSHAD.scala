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

object PUSHAD extends ZeroOperands[PUSHAD] with PUSHADImpl

trait PUSHADImpl extends PUSHAD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x60
        override def hasImplicitOperand = true
  }
}
