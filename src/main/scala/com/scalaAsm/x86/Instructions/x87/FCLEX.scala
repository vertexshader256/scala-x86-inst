package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Exceptions
// Category: general/control

object FCLEX extends InstructionDefinition("FCLEX") with FCLEXImpl

trait FCLEXImpl {
  implicit object FCLEX_0 extends FCLEX._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
