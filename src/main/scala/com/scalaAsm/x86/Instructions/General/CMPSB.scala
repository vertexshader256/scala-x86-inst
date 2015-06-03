package com.scalaAsm.x86
package Instructions
package General

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSB extends InstructionDefinition {
  val mnemonic = "CMPSB"
}

object CMPSB extends ZeroOperands[CMPSB] with CMPSBImpl

trait CMPSBImpl extends CMPSB {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA6
        override def hasImplicitOperand = true
  }
}
