package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Adjust AX After Multiply
// Category: general/arith/decimal

trait AMX extends InstructionDefinition {
  val mnemonic = "AMX"
}

object AMX extends OneOperand[AMX] with AMXImpl

trait AMXImpl extends AMX {
  implicit object AMX_0 extends _1[imm8] {
    val opcode: OneOpcode = 0xD4
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }
}
