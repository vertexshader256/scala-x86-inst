package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Interrupt Return
// Category: general/breakstack

trait IRET extends InstructionDefinition {
  val mnemonic = "IRET"
}

object IRET extends IRET with IRETImpl

trait IRETImpl {
  self: IRET =>
  implicit object IRET_0 extends _0 {
    val opcode: OneOpcode = 0xCF
    override def hasImplicitOperand = true
  }
}
