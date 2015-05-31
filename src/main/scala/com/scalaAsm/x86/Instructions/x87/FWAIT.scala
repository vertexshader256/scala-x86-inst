package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Check pending unmasked floating-point exceptions
// Category: general/control

trait FWAIT extends InstructionDefinition {
  val mnemonic = "FWAIT"
}

object FWAIT extends ZeroOperands[FWAIT] with FWAITImpl

trait FWAITImpl extends FWAIT {
  implicit object FWAIT_0 extends _0 {
    val opcode: OneOpcode = 0x9B
        val hasRMByte = false
  }
}
