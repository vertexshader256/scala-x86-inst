package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store AH into Flags
// Category: general/datamovflgctrl

object SAHF extends InstructionDefinition("SAHF") with SAHFImpl

trait SAHFImpl {
  implicit object SAHF_0 extends SAHF._0 {
    val opcode: OneOpcode = 0x9E
    override def hasImplicitOperand = true
  }
}
