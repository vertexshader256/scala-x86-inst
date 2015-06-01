package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0 and ZF=1
// Category: general/branch/cond

trait LOOPE extends InstructionDefinition {
  val mnemonic = "LOOPE"
}

object LOOPE extends OneOperand[LOOPE] with LOOPEImpl

trait LOOPEImpl extends LOOPE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0xE1
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
