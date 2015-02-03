package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Check pending unmasked floating-point exceptions
// Category: general/control

object FWAIT extends InstructionDefinition("FWAIT") with FWAITImpl

trait FWAITImpl {
  implicit object FWAIT_0 extends FWAIT._0 {
    val opcode: OneOpcode = 0x9B
  }
}
