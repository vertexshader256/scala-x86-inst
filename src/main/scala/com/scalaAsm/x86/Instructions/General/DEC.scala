package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement by 1
// Category: general/arith/binary

trait DEC extends InstructionDefinition {
  val mnemonic = "DEC"
}

object DEC extends OneOperand[DEC] with DECImpl

trait DECLow extends DEC {
  implicit object DEC_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xFE /+ 1
    val format = RmFormat
  }

  implicit object DEC_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 1
    val format = RmFormat
  }

  implicit object DEC_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 1
    val format = RmFormat
  }

  implicit object DEC_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 1
    override def prefix = REX.W(true)
    val format = RmFormat
  }
}

trait DECImpl extends DECLow {
  implicit object DEC_4 extends _1[r16] {
    val opcode: OneOpcode = 0x48 + rw
    val format = RegFormat
  }

  implicit object DEC_5 extends _1[r32] {
    val opcode: OneOpcode = 0x48 + rd
    val format = RegFormat
  }
}
