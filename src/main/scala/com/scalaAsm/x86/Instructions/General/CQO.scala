package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert
// Category: general/conver

trait CQO extends InstructionDefinition {
  val mnemonic = "CQO"
}

object CQO extends ZeroOperands[CQO] with CQOImpl

trait CQOImpl extends CQO {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x99
        override def hasImplicitOperand = true
  }
}
