package com.scalaAsm.x86
package Instructions
package General

// Description: ASCII Adjust AX After Multiply
// Category: general/arith/decimal

trait AAM extends InstructionDefinition {
  val mnemonic = "AAM"
}

object AAM extends ZeroOperands[AAM] with AAMImpl

trait AAMImpl extends AAM {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD4
        override def hasImplicitOperand = true
  }
}
