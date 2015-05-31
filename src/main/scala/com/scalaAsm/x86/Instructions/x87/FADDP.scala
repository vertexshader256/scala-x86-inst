package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Add and Pop
// Category: general/arith

trait FADDP extends InstructionDefinition {
  val mnemonic = "FADDP"
}

object FADDP extends ZeroOperands[FADDP] with FADDPImpl

trait FADDPImpl extends FADDP {
  implicit object FADDP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 0
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
