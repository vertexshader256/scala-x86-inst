package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Enable NPX Interrupt
// Category: general/control

trait FNENI extends InstructionDefinition {
  val mnemonic = "FNENI"
}

object FNENI extends FNENI with FNENIImpl

trait FNENIImpl {
  self: FNENI =>
  implicit object FNENI_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
  }
}
