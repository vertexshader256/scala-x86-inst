package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: ASCII Adjust AX After Multiply
// Category: general/arith/decimal

trait AAM extends InstructionDefinition {
  val mnemonic = "AAM"
}

object AAM extends AAM with AAMImpl

trait AAMImpl {
  self: AAM =>
  implicit object AAM_0 extends _0 {
    val opcode: OneOpcode = 0xD4
    override def hasImplicitOperand = true
  }
}
