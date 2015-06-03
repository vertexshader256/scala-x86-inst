package com.scalaAsm.x86
package Instructions
package General

// Description: Store AH into Flags
// Category: general/datamovflgctrl

trait SAHF extends InstructionDefinition {
  val mnemonic = "SAHF"
}

object SAHF extends ZeroOperands[SAHF] with SAHFImpl

trait SAHFImpl extends SAHF {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9E
        override def hasImplicitOperand = true
  }
}
