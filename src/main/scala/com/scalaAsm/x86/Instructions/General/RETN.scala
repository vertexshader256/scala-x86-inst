package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Return from procedure
// Category: general/branchstack

trait RETN extends InstructionDefinition {
  val mnemonic = "RETN"
}

object RETN extends RETN with ZeroOperands[RETN] with OneOperand[RETN] with RETNImpl

trait RETNImpl {
  self: RETN =>
  implicit object RETN_0 extends _1[imm16] {
    val opcode: OneOpcode = 0xC2
    override def hasImplicitOperand = true
  }

  implicit object RETN_1 extends _0 {
    val opcode: OneOpcode = 0xC3
    override def hasImplicitOperand = true
  }
}
