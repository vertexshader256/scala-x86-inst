package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Increment by 1
// Category: general/arith/binary

object INC extends InstructionDefinition("INC") with INCImpl

trait INCLow {
  implicit object INC_0 extends INC._1[rm8] {
    val opcode: OneOpcode = 0xFE /+ 0
  }

  implicit object INC_1 extends INC._1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 0
  }

  implicit object INC_2 extends INC._1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 0
  }

  implicit object INC_3 extends INC._1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 0
    override def prefix = REX.W(true)
  }
}

trait INCImpl extends INCLow {
  implicit object INC_4 extends INC._1[r16] {
    val opcode: OneOpcode = 0x40 + rw
    override def explicitFormat(op1: r16) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
  }

  implicit object INC_5 extends INC._1[r32] {
    val opcode: OneOpcode = 0x40 + rd
    override def explicitFormat(op1: r32) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
  }
}
