package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Word to Doubleword
// Category: general/conver

object CWD extends InstructionDefinition("CWD") with CWDImpl

trait CWDImpl {
  implicit object CWD_0 extends CWD._0 {
    val opcode: OneOpcode = 0x99
    override def hasImplicitOperand = true
  }
}
