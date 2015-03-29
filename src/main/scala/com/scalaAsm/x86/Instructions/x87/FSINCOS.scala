package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Sine and Cosine
// Category: general/trans

trait FSINCOS extends InstructionDefinition {
  val mnemonic = "FSINCOS"
}

object FSINCOS extends FSINCOS with FSINCOSImpl

trait FSINCOSImpl {
  self: FSINCOS =>
  implicit object FSINCOS_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
