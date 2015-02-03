package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Save Processor Extended States
// Category: general

object XSAVE extends InstructionDefinition("XSAVE") with XSAVEImpl

trait XSAVEImpl {
  implicit object XSAVE_0 extends XSAVE._1[m] {
    val opcode: TwoOpcodes = (0x0F, 0xAE) /+ 4
    override def hasImplicitOperand = true
  }
}
