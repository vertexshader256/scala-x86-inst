package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Enable NPX Interrupt
// Category: general/control

object FNENI extends InstructionDefinition("FNENI") with FNENIImpl

trait FNENIImpl {
  implicit object FNENI_0 extends FNENI._0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
