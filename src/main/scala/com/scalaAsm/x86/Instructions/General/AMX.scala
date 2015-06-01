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
  implicit object _0 extends OneOp[imm8] {
    val opcode: OneOpcode = 0xD4
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
