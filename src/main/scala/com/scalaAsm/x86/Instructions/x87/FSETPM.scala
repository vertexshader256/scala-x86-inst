package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Protected Mode
// Category: general/control

object FSETPM extends InstructionDefinition("FSETPM") with FSETPMImpl

trait FSETPMImpl {
  implicit object FSETPM_0 extends FSETPM._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
