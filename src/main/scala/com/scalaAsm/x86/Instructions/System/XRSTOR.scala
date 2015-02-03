package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Restore Processor Extended States
// Category: general

object XRSTOR extends InstructionDefinition("XRSTOR") with XRSTORImpl

trait XRSTORImpl {
  implicit object XRSTOR_0 extends XRSTOR._1[m] {
    val opcode: TwoOpcodes = (0x0F, 0xAE) /+ 5
    override def hasImplicitOperand = true
  }
}
