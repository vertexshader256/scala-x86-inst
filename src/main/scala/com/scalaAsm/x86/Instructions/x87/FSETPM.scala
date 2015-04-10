package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Protected Mode
// Category: general/control

trait FSETPM extends InstructionDefinition {
  val mnemonic = "FSETPM"
}

object FSETPM extends FSETPM with ZeroOperands[FSETPM] with FSETPMImpl

trait FSETPMImpl {
  self: FSETPM =>
  implicit object FSETPM_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
