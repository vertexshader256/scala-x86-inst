package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Save Processor Extended States
// Category: general

trait XSAVE extends InstructionDefinition {
  val mnemonic = "XSAVE"
}

object XSAVE extends OneOperand[XSAVE] with XSAVEImpl

trait XSAVEImpl extends XSAVE {
  implicit object _0 extends OneOp[m] {
    val opcode: TwoOpcodes = (0x0F, 0xAE) /+ 4
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
