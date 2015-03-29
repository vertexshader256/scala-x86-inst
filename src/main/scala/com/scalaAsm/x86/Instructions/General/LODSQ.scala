package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

trait LODSQ extends InstructionDefinition {
  val mnemonic = "LODSQ"
}

object LODSQ extends LODSQ with LODSQImpl

trait LODSQImpl {
  self: LODSQ =>
  implicit object LODSQ_0 extends _0 {
    val opcode: OneOpcode = 0xAD
    override def hasImplicitOperand = true
  }
}
