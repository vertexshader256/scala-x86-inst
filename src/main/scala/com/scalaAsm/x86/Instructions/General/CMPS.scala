package com.scalaAsm.x86
package Instructions
package General

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPS extends InstructionDefinition {
  val mnemonic = "CMPS"
}

object CMPS extends ZeroOperands[CMPS] with CMPSImpl

trait CMPSImpl extends CMPS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA6
        override def hasImplicitOperand = true
  }
}
