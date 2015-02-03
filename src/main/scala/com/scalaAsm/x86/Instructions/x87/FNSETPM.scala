package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Protected Mode
// Category: general/control

object FNSETPM extends InstructionDefinition("FNSETPM") with FNSETPMImpl

trait FNSETPMImpl {
  implicit object FNSETPM_0 extends FNSETPM._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
