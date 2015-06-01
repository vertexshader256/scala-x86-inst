package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Exchange and Add
// Category: general/datamovarith/binary

trait XADD extends InstructionDefinition {
  val mnemonic = "XADD"
}

object XADD extends TwoOperands[XADD] with XADDImpl

trait XADDImpl extends XADD {
  implicit object XADD_0 extends _2[rm8, r8] {
    val opcode: TwoOpcodes = (0x0F, 0xC0) /r
    val format = MemRegFormat
  }

  implicit object XADD_1 extends _2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    val format = MemRegFormat
  }

  implicit object XADD_2 extends _2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    val format = MemRegFormat
  }

  implicit object XADD_3 extends _2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }
}
