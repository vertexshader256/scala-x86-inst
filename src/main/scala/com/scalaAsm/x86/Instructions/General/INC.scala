package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Increment by 1
// Category: general/arith/binary

trait INC extends InstructionDefinition {
  val mnemonic = "INC"
}

object INC extends OneOperand[INC] with INCImpl

trait INCLow extends INC {
  implicit object INC_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xFE /+ 0
    val format = RmFormat
    val hasRMByte = true
  }

  implicit object INC_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 0
    val format = RmFormat
    val hasRMByte = true
  }

  implicit object INC_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 0
    val format = RmFormat
    val hasRMByte = true
  }

  implicit object INC_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 0
    override def prefix = REX.W(true)
    val format = RmFormat
    val hasRMByte = true
  }
}

trait INCImpl extends INCLow {
  implicit object INC_4 extends _1[r16] {
    val opcode: OneOpcode = 0x40 + rw
    val format = RegFormat
    val hasRMByte = false
  }

  implicit object INC_5 extends _1[r32] {
    val opcode: OneOpcode = 0x40 + rd
    val format = RegFormat
    val hasRMByte = false
  }
}
