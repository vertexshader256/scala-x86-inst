package com.scalaAsm.x86
package Instructions
package General

// Description: Decimal Adjust AL after Subtraction
// Category: general/arith/decimal

trait DAS extends InstructionDefinition {
  val mnemonic = "DAS"
}

object DAS extends ZeroOperands[DAS] with DASImpl

trait DASImpl extends DAS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x2F
        override def hasImplicitOperand = true
  }
}
