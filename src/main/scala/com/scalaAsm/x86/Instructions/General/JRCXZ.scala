package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if rCX register is 0
// Category: general/branch/cond

trait JRCXZ extends InstructionDefinition {
  val mnemonic = "JRCXZ"
}

object JRCXZ extends JRCXZ with JRCXZImpl

trait JRCXZImpl {
  self: JRCXZ =>
  implicit object JRCXZ_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE3
    override def hasImplicitOperand = true
  }
}
