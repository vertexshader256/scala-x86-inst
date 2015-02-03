package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Disable NPX Interrupt
// Category: general/control

object FDISI extends InstructionDefinition("FDISI") with FDISIImpl

trait FDISIImpl {
  implicit object FDISI_0 extends FDISI._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
