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

object LLDT extends OneOperand[LLDT] with LLDTImpl

trait LLDTImpl extends LLDT {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
