package com.scalaAsm.x86
package Instructions
package General

// Description: ASCII Adjust AX Before Division
// Category: general/arith/decimal

trait AAD extends InstructionDefinition {
  val mnemonic = "AAD"
}

object AAD extends ZeroOperands[AAD] with AADImpl

trait AADImpl extends AAD {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD5
        override def hasImplicitOperand = true
  }
}
