package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Restore Processor Extended States
// Category: general

trait XRSTOR extends InstructionDefinition {
  val mnemonic = "XRSTOR"
}

object XRSTOR extends OneOperand[XRSTOR] with XRSTORImpl

trait XRSTORImpl extends XRSTOR {
  implicit object XRSTOR_0 extends _1[m] {
    val opcode: TwoOpcodes = (0x0F, 0xAE) /+ 5
    override def hasImplicitOperand = true
  }
}
