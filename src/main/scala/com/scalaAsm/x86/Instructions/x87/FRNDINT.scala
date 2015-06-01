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

object FRNDINT extends ZeroOperands[FRNDINT] with FRNDINTImpl

trait FRNDINTImpl extends FRNDINT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
