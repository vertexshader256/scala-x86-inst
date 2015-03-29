package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output to Port
// Category: general/inout

trait OUT extends InstructionDefinition {
  val mnemonic = "OUT"
}

object OUT extends OUT with OUTImpl

trait OUTImpl {
  self: OUT =>
  implicit object OUT_0 extends _1[imm8] {
    val opcode: OneOpcode = 0xE6
    override def hasImplicitOperand = true
  }

  implicit object OUT_1 extends _0 {
    val opcode: OneOpcode = 0xEE
    override def hasImplicitOperand = true
  }
}
