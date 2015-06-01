package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Task Register
// Category: general

trait LTR extends InstructionDefinition {
  val mnemonic = "LTR"
}

object LTR extends OneOperand[LTR] with LTRImpl

trait LTRImpl extends LTR {
  implicit object LTR_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
