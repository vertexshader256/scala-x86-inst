package com.scalaAsm.x86
package Instructions
package General

// Description: Pop a Value from the Stack
// Category: general/stacksegreg

trait POP extends InstructionDefinition {
  val mnemonic = "POP"
}

object POP extends ZeroOperands[POP] with OneOperand[POP] with POPImpl

trait POPLow extends POP {
  implicit object _0 extends OneOp[rm16] {
    val opcode: OneOpcode = 0x8F /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[rm32] {
    val opcode: OneOpcode = 0x8F /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[rm64] {
    val opcode: OneOpcode = 0x8F /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}

trait POPImpl extends POPLow {
  implicit object _3 extends NoOp{
    val opcode: OneOpcode = 0x07
        override def hasImplicitOperand = true
  }

  implicit object _4 extends OneOp[r16] {
    val opcode: OneOpcode = 0x58 + rw
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _5 extends OneOp[r32] {
    val opcode: OneOpcode = 0x58 + rd
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _6 extends OneOp[r64] {
    val opcode: OneOpcode = 0x58 + ro
    val format = RegFormat
    override def hasImplicitOperand = true
  }
}
