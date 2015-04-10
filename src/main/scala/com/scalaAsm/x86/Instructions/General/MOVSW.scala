package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVSW extends InstructionDefinition {
  val mnemonic = "MOVSW"
}

object MOVSW extends MOVSW with ZeroOperands[MOVSW] with MOVSWImpl

trait MOVSWImpl {
  self: MOVSW =>
  implicit object MOVSW_0 extends _0 {
    val opcode: OneOpcode = 0xA5
    override def hasImplicitOperand = true
  }
}
