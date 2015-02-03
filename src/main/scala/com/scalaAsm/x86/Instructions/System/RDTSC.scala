package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read Time-Stamp Counter
// Category: general

object RDTSC extends InstructionDefinition("RDTSC") with RDTSCImpl

trait RDTSCImpl {
  implicit object RDTSC_0 extends RDTSC._0 {
    val opcode: TwoOpcodes = (0x0F, 0x31)
    override def hasImplicitOperand = true
  }
}
