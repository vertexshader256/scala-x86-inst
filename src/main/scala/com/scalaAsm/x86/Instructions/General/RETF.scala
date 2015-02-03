package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Return from procedure
// Category: general/branchstack

object RETF extends InstructionDefinition("RETF") with RETFImpl

trait RETFImpl {
  implicit object RETF_0 extends RETF._1[imm16] {
    val opcode: OneOpcode = 0xCA
    override def hasImplicitOperand = true
  }

  implicit object RETF_1 extends RETF._0 {
    val opcode: OneOpcode = 0xCB
    override def hasImplicitOperand = true
  }
}
