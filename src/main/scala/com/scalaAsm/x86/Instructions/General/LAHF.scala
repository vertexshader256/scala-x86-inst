package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Status Flags into AH Register
// Category: general/datamovflgctrl

object LAHF extends InstructionDefinition("LAHF") with LAHFImpl

trait LAHFImpl {
  implicit object LAHF_0 extends LAHF._0 {
    val opcode: OneOpcode = 0x9F
    override def hasImplicitOperand = true
  }
}
