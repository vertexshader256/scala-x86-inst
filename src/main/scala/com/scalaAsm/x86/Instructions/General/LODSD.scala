package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

trait LODSD extends InstructionDefinition {
  val mnemonic = "LODSD"
}

object LODSD extends LODSD with ZeroOperands[LODSD] with LODSDImpl

trait LODSDImpl {
  self: LODSD =>
  implicit object LODSD_0 extends _0 {
    val opcode: OneOpcode = 0xAD
    override def hasImplicitOperand = true
  }
}
