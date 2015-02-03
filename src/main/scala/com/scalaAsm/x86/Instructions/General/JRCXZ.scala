package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if rCX register is 0
// Category: general/branch/cond

object JRCXZ extends InstructionDefinition("JRCXZ") with JRCXZImpl

trait JRCXZImpl {
  implicit object JRCXZ_0 extends JRCXZ._1[rel8] {
    val opcode: OneOpcode = 0xE3
    override def hasImplicitOperand = true
  }
}
