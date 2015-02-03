package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Word to Doubleword
// Category: general/conver

object CWDE extends InstructionDefinition("CWDE") with CWDEImpl

trait CWDEImpl {
  implicit object CWDE_0 extends CWDE._0 {
    val opcode: OneOpcode = 0x98
    override def hasImplicitOperand = true
  }
}
