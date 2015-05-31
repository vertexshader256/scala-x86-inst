package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Partial Arctangent and Pop
// Category: general/trans

trait FPATAN extends InstructionDefinition {
  val mnemonic = "FPATAN"
}

object FPATAN extends ZeroOperands[FPATAN] with FPATANImpl

trait FPATANImpl extends FPATAN {
  implicit object FPATAN_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
