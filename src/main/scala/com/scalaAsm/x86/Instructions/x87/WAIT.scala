package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Check pending unmasked floating-point exceptions
// Category: general/control

object WAIT extends InstructionDefinition("WAIT") with WAITImpl

trait WAITImpl {
  implicit object WAIT_0 extends WAIT._0 {
    val opcode: OneOpcode = 0x9B
  }
}
