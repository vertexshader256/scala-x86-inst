package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Local Descriptor Table Register
// Category: general

trait LLDT extends InstructionDefinition {
  val mnemonic = "LLDT"
}

object LLDT extends LLDT with OneOperand[LLDT] with LLDTImpl

trait LLDTImpl {
  self: LLDT =>
  implicit object LLDT_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 2
    override def hasImplicitOperand = true
  }
}
