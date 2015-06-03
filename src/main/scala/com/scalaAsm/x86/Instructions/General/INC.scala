package com.scalaAsm.x86
package Instructions
package General

// Description: Increment by 1
// Category: general/arith/binary

trait INC extends InstructionDefinition {
  val mnemonic = "INC"
}

object INC extends OneOperand[INC] with INCImpl

trait INCLow extends INC {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xFE /+ 0
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xFF /+ 0
    val format = RmFormat
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xFF /+ 0
    val format = RmFormat
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xFF /+ 0
    override def prefix = REX.W(true)
    val format = RmFormat
  }
}

trait INCImpl extends INCLow {
  implicit object _4 extends OneOp[r16] {
    val opcode: OneOpcode = 0x40 + rw
    val format = RegFormat
  }

  implicit object _5 extends OneOp[r32] {
    val opcode: OneOpcode = 0x40 + rd
    val format = RegFormat
  }
}
