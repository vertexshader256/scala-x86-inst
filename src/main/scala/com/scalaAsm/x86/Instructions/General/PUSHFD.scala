package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Push eFLAGS Register onto the Stack
// Category: general/stackflgctrl

trait PUSHFD extends InstructionDefinition {
  val mnemonic = "PUSHFD"
}

object PUSHFD extends ZeroOperands[PUSHFD] with PUSHFDImpl

trait PUSHFDImpl extends PUSHFD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9C
        override def hasImplicitOperand = true
  }
}
