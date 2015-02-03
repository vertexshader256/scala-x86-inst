package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if eCX register is 0
// Category: general/branch/cond

object JCXZ extends InstructionDefinition("JCXZ") with JCXZImpl

trait JCXZImpl {
  implicit object JCXZ_0 extends JCXZ._1[rel8] {
    val opcode: OneOpcode = 0xE3
    override def hasImplicitOperand = true
  }
}
