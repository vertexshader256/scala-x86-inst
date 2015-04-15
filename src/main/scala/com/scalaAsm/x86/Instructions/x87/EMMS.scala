package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Empty MMX Technology State
// Category: general/control

trait EMMS extends InstructionDefinition {
  val mnemonic = "EMMS"
}

object EMMS extends ZeroOperands[EMMS] with EMMSImpl

trait EMMSImpl extends EMMS {
  implicit object EMMS_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x77)
  }
}
