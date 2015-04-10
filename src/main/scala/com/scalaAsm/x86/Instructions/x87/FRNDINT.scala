package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Round to Integer
// Category: general/arith

trait FRNDINT extends InstructionDefinition {
  val mnemonic = "FRNDINT"
}

object FRNDINT extends FRNDINT with ZeroOperands[FRNDINT] with FRNDINTImpl

trait FRNDINTImpl {
  self: FRNDINT =>
  implicit object FRNDINT_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 7
    override def hasImplicitOperand = true
  }
}
