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

object RETN extends ZeroOperands[RETN] with OneOperand[RETN] with RETNImpl

trait RETNImpl extends RETN {
  implicit object RETN_0 extends _1[imm16] {
    val opcode: OneOpcode = 0xC2
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object RETN_1 extends _0 {
    val opcode: OneOpcode = 0xC3
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
