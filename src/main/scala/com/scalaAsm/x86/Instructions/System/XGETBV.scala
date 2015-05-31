package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Get Value of Extended Control Register
// Category: general

trait XGETBV extends InstructionDefinition {
  val mnemonic = "XGETBV"
}

object XGETBV extends ZeroOperands[XGETBV] with XGETBVImpl

trait XGETBVImpl extends XGETBV {
  implicit object XGETBV_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 2
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
