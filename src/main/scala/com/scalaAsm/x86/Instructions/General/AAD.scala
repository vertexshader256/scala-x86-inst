package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: ASCII Adjust AX Before Division
// Category: general/arith/decimal

trait AAD extends InstructionDefinition {
  val mnemonic = "AAD"
}

object AAD extends ZeroOperands[AAD] with AADImpl

trait AADImpl extends AAD {
  implicit object AAD_0 extends _0 {
    val opcode: OneOpcode = 0xD5
    override def hasImplicitOperand = true
  }
}
