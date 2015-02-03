package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Enable NPX Interrupt
// Category: general/control

object FENI extends InstructionDefinition("FENI") with FENIImpl

trait FENIImpl {
  implicit object FENI_0 extends FENI._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
