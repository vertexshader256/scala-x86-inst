package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Word to Doubleword
// Category: general/conver

trait CWD extends InstructionDefinition {
  val mnemonic = "CWD"
}

object CWD extends ZeroOperands[CWD] with CWDImpl

trait CWDImpl extends CWD {
  implicit object CWD_0 extends _0 {
    val opcode: OneOpcode = 0x99
    override def hasImplicitOperand = true
  }
}
