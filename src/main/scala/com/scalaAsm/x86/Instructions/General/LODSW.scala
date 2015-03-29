package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

trait LODSW extends InstructionDefinition {
  val mnemonic = "LODSW"
}

object LODSW extends LODSW with LODSWImpl

trait LODSWImpl {
  self: LODSW =>
  implicit object LODSW_0 extends _0 {
    val opcode: OneOpcode = 0xAD
    override def hasImplicitOperand = true
  }
}
