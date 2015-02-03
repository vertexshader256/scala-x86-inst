package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0 and ZF=1
// Category: general/branch/cond

object LOOPE extends InstructionDefinition("LOOPE") with LOOPEImpl

trait LOOPEImpl {
  implicit object LOOPE_0 extends LOOPE._1[rel8] {
    val opcode: OneOpcode = 0xE1
    override def hasImplicitOperand = true
  }
}
