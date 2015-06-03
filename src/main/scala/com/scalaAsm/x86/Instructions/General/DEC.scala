package com.scalaAsm.x86
package Instructions
package General

// Description: Decrement by 1
// Category: general/arith/binary

trait DEC extends InstructionDefinition {
  val mnemonic = "DEC"
}

object DEC extends OneOperand[DEC] with DECImpl

trait DECLow extends DEC {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xFE /+ 1
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xFF /+ 1
    val format = RmFormat
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xFF /+ 1
    val format = RmFormat
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xFF /+ 1
    override def prefix = REX.W(true)
    val format = RmFormat
  }
}

trait DECImpl extends DECLow {
  implicit object _4 extends OneOp[r16] {
    val opcode: OneOpcode = 0x48 + rw
    val format = RegFormat
  }

  implicit object _5 extends OneOp[r32] {
    val opcode: OneOpcode = 0x48 + rd
    val format = RegFormat
  }
}
