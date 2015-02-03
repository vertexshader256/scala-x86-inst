package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0 and ZF=0
// Category: general/branch/cond

object LOOPNE extends InstructionDefinition("LOOPNE") with LOOPNEImpl

trait LOOPNEImpl {
  implicit object LOOPNE_0 extends LOOPNE._1[rel8] {
    val opcode: OneOpcode = 0xE0
    override def hasImplicitOperand = true
  }
}
