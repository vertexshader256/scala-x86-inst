package com.scalaAsm.x86
package Instructions
package x87

// Description: Absolute Value
// Category: general/arith

trait FABS extends InstructionDefinition {
  val mnemonic = "FABS"
}

object FABS extends ZeroOperands[FABS] with FABSImpl

trait FABSImpl extends FABS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
