package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

trait LODS extends InstructionDefinition {
  val mnemonic = "LODS"
}

object LODS extends ZeroOperands[LODS] with LODSImpl

trait LODSImpl extends LODS {
  implicit object LODS_0 extends _0 {
    val opcode: OneOpcode = 0xAC
    override def hasImplicitOperand = true
  }
}
