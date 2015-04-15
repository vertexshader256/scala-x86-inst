package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop Stack into eFLAGS Register
// Category: general/stackflgctrl

trait POPFD extends InstructionDefinition {
  val mnemonic = "POPFD"
}

object POPFD extends ZeroOperands[POPFD] with POPFDImpl

trait POPFDImpl extends POPFD {
  implicit object POPFD_0 extends _0 {
    val opcode: OneOpcode = 0x9D
    override def hasImplicitOperand = true
  }
}
