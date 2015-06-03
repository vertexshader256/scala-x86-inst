package com.scalaAsm.x86
package Instructions
package System

// Description: Read Time-Stamp Counter
// Category: general

trait RDTSC extends InstructionDefinition {
  val mnemonic = "RDTSC"
}

object RDTSC extends ZeroOperands[RDTSC] with RDTSCImpl

trait RDTSCImpl extends RDTSC {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x31)
        override def hasImplicitOperand = true
  }
}
