package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Disable NPX Interrupt
// Category: general/control

trait FDISI extends InstructionDefinition {
  val mnemonic = "FDISI"
}

object FDISI extends FDISI with ZeroOperands[FDISI] with FDISIImpl

trait FDISIImpl {
  self: FDISI =>
  implicit object FDISI_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
