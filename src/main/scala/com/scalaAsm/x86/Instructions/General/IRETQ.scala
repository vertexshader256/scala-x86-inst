package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Interrupt Return
// Category: general/breakstack

trait IRETQ extends InstructionDefinition {
  val mnemonic = "IRETQ"
}

object IRETQ extends ZeroOperands[IRETQ] with IRETQImpl

trait IRETQImpl extends IRETQ {
  implicit object IRETQ_0 extends _0 {
    val opcode: OneOpcode = 0xCF
    override def hasImplicitOperand = true
  }
}
