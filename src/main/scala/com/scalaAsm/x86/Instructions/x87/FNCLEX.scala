package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Exceptions
// Category: general/control

object FNCLEX extends InstructionDefinition("FNCLEX") with FNCLEXImpl

trait FNCLEXImpl {
  implicit object FNCLEX_0 extends FNCLEX._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
