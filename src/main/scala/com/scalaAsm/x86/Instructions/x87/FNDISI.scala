package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Disable NPX Interrupt
// Category: general/control

object FNDISI extends InstructionDefinition("FNDISI") with FNDISIImpl

trait FNDISIImpl {
  implicit object FNDISI_0 extends FNDISI._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
