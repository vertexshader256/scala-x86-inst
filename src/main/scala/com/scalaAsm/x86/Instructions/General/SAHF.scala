package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store AH into Flags
// Category: general/datamovflgctrl

trait SAHF extends InstructionDefinition {
  val mnemonic = "SAHF"
}

object SAHF extends ZeroOperands[SAHF] with SAHFImpl

trait SAHFImpl extends SAHF {
  implicit object SAHF_0 extends _0 {
    val opcode: OneOpcode = 0x9E
        override def hasImplicitOperand = true
  }
}
