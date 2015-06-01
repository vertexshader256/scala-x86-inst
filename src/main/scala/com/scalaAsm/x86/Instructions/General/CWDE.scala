package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Word to Doubleword
// Category: general/conver

trait CWDE extends InstructionDefinition {
  val mnemonic = "CWDE"
}

object CWDE extends ZeroOperands[CWDE] with CWDEImpl

trait CWDEImpl extends CWDE {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x98
        override def hasImplicitOperand = true
  }
}
