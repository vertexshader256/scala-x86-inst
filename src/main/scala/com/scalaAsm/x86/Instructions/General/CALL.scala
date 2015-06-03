package com.scalaAsm.x86
package Instructions
package General

// Description: Call Procedure
// Category: general/branchstack

trait CALL extends InstructionDefinition {
  val mnemonic = "CALL"
}

object CALL extends OneOperand[CALL] with CALLImpl

trait CALLLow extends CALL {
  implicit object _0 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xFF /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xFF /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xFF /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}

trait CALLImpl extends CALLLow {
  implicit object _3 extends OneOp[rel16] {
    val opcode: OneOpcode = 0xE8
    val format = ImmFormat
    override def hasImplicitOperand = true
  }

  implicit object _4 extends OneOp[rel32] {
    val opcode: OneOpcode = 0xE8
    val format = ImmFormat
    override def hasImplicitOperand = true
  }
}
