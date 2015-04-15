package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Return from procedure
// Category: general/branchstack

trait RETF extends InstructionDefinition {
  val mnemonic = "RETF"
}

object RETF extends ZeroOperands[RETF] with OneOperand[RETF] with RETFImpl

trait RETFImpl extends RETF {
  implicit object RETF_0 extends _1[imm16] {
    val opcode: OneOpcode = 0xCA
    override def hasImplicitOperand = true
  }

  implicit object RETF_1 extends _0 {
    val opcode: OneOpcode = 0xCB
    override def hasImplicitOperand = true
  }
}
