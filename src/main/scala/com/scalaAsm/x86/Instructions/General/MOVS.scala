package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVS extends InstructionDefinition {
  val mnemonic = "MOVS"
}

object MOVS extends ZeroOperands[MOVS] with MOVSImpl

trait MOVSImpl extends MOVS {
  implicit object MOVS_0 extends _0 {
    val opcode: OneOpcode = 0xA4
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
