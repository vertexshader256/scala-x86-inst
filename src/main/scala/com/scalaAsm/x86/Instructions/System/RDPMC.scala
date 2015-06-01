package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Read Performance-Monitoring Counters
// Category: general

trait RDPMC extends InstructionDefinition {
  val mnemonic = "RDPMC"
}

object RDPMC extends ZeroOperands[RDPMC] with RDPMCImpl

trait RDPMCImpl extends RDPMC {
  implicit object RDPMC_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x33)
        override def hasImplicitOperand = true
  }
}
