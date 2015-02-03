package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if eCX register is 0
// Category: general/branch/cond

object JECXZ extends InstructionDefinition("JECXZ") with JECXZImpl

trait JECXZImpl {
  implicit object JECXZ_0 extends JECXZ._1[rel8] {
    val opcode: OneOpcode = 0xE3
    override def hasImplicitOperand = true
  }
}
