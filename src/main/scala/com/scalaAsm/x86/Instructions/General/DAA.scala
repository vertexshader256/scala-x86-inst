package com.scalaAsm.x86
package Instructions
package General

// Description: Decimal Adjust AL after Addition
// Category: general/arith/decimal

trait DAA extends InstructionDefinition {
  val mnemonic = "DAA"
}

object DAA extends ZeroOperands[DAA] with DAAImpl

trait DAAImpl extends DAA {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x27
        override def hasImplicitOperand = true
  }
}
