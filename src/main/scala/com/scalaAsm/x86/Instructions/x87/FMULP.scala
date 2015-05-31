package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Multiply and Pop
// Category: general/arith

trait FMULP extends InstructionDefinition {
  val mnemonic = "FMULP"
}

object FMULP extends ZeroOperands[FMULP] with FMULPImpl

trait FMULPImpl extends FMULP {
  implicit object FMULP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 1
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
