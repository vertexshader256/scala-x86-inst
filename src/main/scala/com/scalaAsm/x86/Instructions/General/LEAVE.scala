package com.scalaAsm.x86
package Instructions
package General

// Description: High Level Procedure Exit
// Category: general/stack

trait LEAVE extends InstructionDefinition {
  val mnemonic = "LEAVE"
}

object LEAVE extends ZeroOperands[LEAVE] with LEAVEImpl

trait LEAVEImpl extends LEAVE {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xC9
        override def hasImplicitOperand = true
  }
}
