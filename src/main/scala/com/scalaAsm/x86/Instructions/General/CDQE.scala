package com.scalaAsm.x86
package Instructions
package General

// Description: Convert
// Category: general/conver

trait CDQE extends InstructionDefinition {
  val mnemonic = "CDQE"
}

object CDQE extends ZeroOperands[CDQE] with CDQEImpl

trait CDQEImpl extends CDQE {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x98
        override def hasImplicitOperand = true
  }
}
