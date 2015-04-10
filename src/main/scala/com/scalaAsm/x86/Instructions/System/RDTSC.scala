package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read Time-Stamp Counter
// Category: general

trait RDTSC extends InstructionDefinition {
  val mnemonic = "RDTSC"
}

object RDTSC extends RDTSC with ZeroOperands[RDTSC] with RDTSCImpl

trait RDTSCImpl {
  self: RDTSC =>
  implicit object RDTSC_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x31)
    override def hasImplicitOperand = true
  }
}
