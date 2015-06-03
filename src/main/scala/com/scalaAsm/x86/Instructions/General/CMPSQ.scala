package com.scalaAsm.x86
package Instructions
package General

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSQ extends InstructionDefinition {
  val mnemonic = "CMPSQ"
}

object CMPSQ extends ZeroOperands[CMPSQ] with CMPSQImpl

trait CMPSQImpl extends CMPSQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA7
        override def hasImplicitOperand = true
  }
}
