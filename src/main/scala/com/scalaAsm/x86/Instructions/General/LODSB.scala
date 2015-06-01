package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

trait LODSB extends InstructionDefinition {
  val mnemonic = "LODSB"
}

object LODSB extends ZeroOperands[LODSB] with LODSBImpl

trait LODSBImpl extends LODSB {
  implicit object LODSB_0 extends _0 {
    val opcode: OneOpcode = 0xAC
        override def hasImplicitOperand = true
  }
}
