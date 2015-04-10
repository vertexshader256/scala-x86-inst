package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Status Flags into AH Register
// Category: general/datamovflgctrl

trait LAHF extends InstructionDefinition {
  val mnemonic = "LAHF"
}

object LAHF extends LAHF with ZeroOperands[LAHF] with LAHFImpl

trait LAHFImpl {
  self: LAHF =>
  implicit object LAHF_0 extends _0 {
    val opcode: OneOpcode = 0x9F
    override def hasImplicitOperand = true
  }
}
