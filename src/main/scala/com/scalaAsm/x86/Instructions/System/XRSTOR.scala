package com.scalaAsm.x86
package Instructions
package System

// Description: Restore Processor Extended States
// Category: general

trait XRSTOR extends InstructionDefinition {
  val mnemonic = "XRSTOR"
}

object XRSTOR extends OneOperand[XRSTOR] with XRSTORImpl

trait XRSTORImpl extends XRSTOR {
  implicit object _0 extends OneOp[m] {
    val opcode: TwoOpcodes = (0x0F, 0xAE) /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
