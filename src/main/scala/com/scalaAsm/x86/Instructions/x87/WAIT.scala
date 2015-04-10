package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Check pending unmasked floating-point exceptions
// Category: general/control

trait WAIT extends InstructionDefinition {
  val mnemonic = "WAIT"
}

object WAIT extends WAIT with ZeroOperands[WAIT] with WAITImpl

trait WAITImpl {
  self: WAIT =>
  implicit object WAIT_0 extends _0 {
    val opcode: OneOpcode = 0x9B
  }
}
