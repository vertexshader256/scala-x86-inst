package com.scalaAsm.x86
package Instructions
package System

// Description: Read Performance-Monitoring Counters
// Category: general

trait RDPMC extends InstructionDefinition {
  val mnemonic = "RDPMC"
}

object RDPMC extends ZeroOperands[RDPMC] with RDPMCImpl

trait RDPMCImpl extends RDPMC {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x33)
        override def hasImplicitOperand = true
  }
}
