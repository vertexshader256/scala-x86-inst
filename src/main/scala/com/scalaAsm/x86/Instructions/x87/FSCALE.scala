package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scale
// Category: general/arith

trait FSCALE extends InstructionDefinition {
  val mnemonic = "FSCALE"
}

object FSCALE extends FSCALE with ZeroOperands[FSCALE] with FSCALEImpl

trait FSCALEImpl {
  self: FSCALE =>
  implicit object FSCALE_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
