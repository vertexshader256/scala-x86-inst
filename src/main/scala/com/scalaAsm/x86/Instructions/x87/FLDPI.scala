package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant π
// Category: general/ldconst

trait FLDPI extends InstructionDefinition {
  val mnemonic = "FLDPI"
}

object FLDPI extends FLDPI with ZeroOperands[FLDPI] with FLDPIImpl

trait FLDPIImpl {
  self: FLDPI =>
  implicit object FLDPI_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 5
    override def hasImplicitOperand = true
  }
}
