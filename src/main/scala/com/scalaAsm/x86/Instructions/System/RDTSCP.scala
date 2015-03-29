package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read Time-Stamp Counter and Processor ID
// Category: general

trait RDTSCP extends InstructionDefinition {
  val mnemonic = "RDTSCP"
}

object RDTSCP extends RDTSCP with RDTSCPImpl

trait RDTSCPImpl {
  self: RDTSCP =>
  implicit object RDTSCP_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
    override def hasImplicitOperand = true
  }
}
