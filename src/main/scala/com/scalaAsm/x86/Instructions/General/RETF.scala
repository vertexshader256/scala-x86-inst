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
  implicit object _0 extends OneOp[imm16] {
    val opcode: OneOpcode = 0xCA
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends NoOp{
    val opcode: OneOpcode = 0xCB
        override def hasImplicitOperand = true
  }
}
