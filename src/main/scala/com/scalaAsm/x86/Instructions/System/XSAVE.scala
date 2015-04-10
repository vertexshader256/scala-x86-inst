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

object XSAVE extends XSAVE with OneOperand[XSAVE] with XSAVEImpl

trait XSAVEImpl {
  self: XSAVE =>
  implicit object XSAVE_0 extends _1[m] {
    val opcode: TwoOpcodes = (0x0F, 0xAE) /+ 4
    override def hasImplicitOperand = true
  }
}
