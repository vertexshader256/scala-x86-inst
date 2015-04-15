package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Extract Exponent and Significand
// Category: general/arith

trait FXTRACT extends InstructionDefinition {
  val mnemonic = "FXTRACT"
}

object FXTRACT extends ZeroOperands[FXTRACT] with FXTRACTImpl

trait FXTRACTImpl extends FXTRACT {
  implicit object FXTRACT_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
