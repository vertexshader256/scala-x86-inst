package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read Performance-Monitoring Counters
// Category: general

object RDPMC extends InstructionDefinition("RDPMC") with RDPMCImpl

trait RDPMCImpl {
  implicit object RDPMC_0 extends RDPMC._0 {
    val opcode: TwoOpcodes = (0x0F, 0x33)
    override def hasImplicitOperand = true
  }
}
