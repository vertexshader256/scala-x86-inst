package com.scalaAsm.x86
package Instructions
package General

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSW extends InstructionDefinition {
  val mnemonic = "CMPSW"
}

object CMPSW extends ZeroOperands[CMPSW] with CMPSWImpl

trait CMPSWImpl extends CMPSW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA7
        override def hasImplicitOperand = true
  }
}
