package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Protected Mode
// Category: general/control

trait FNSETPM extends InstructionDefinition {
  val mnemonic = "FNSETPM"
}

object FNSETPM extends ZeroOperands[FNSETPM] with FNSETPMImpl

trait FNSETPMImpl extends FNSETPM {
  implicit object FNSETPM_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
