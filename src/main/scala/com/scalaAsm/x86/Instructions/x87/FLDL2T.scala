package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant log210
// Category: general/ldconst

trait FLDL2T extends InstructionDefinition {
  val mnemonic = "FLDL2T"
}

object FLDL2T extends ZeroOperands[FLDL2T] with FLDL2TImpl

trait FLDL2TImpl extends FLDL2T {
  implicit object FLDL2T_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
