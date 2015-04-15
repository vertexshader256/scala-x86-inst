package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port
// Category: general/inout

trait IN extends InstructionDefinition {
  val mnemonic = "IN"
}

object IN extends ZeroOperands[IN] with OneOperand[IN] with INImpl

trait INImpl extends IN {
  implicit object IN_0 extends _1[imm8] {
    val opcode: OneOpcode = 0xE4
    override def hasImplicitOperand = true
  }

  implicit object IN_1 extends _0 {
    val opcode: OneOpcode = 0xEC
    override def hasImplicitOperand = true
  }
}
