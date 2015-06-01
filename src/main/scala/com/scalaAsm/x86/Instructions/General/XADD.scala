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
  implicit object _0 extends TwoOp[rm8, r8] {
    val opcode: TwoOpcodes = (0x0F, 0xC0) /r
    val format = MemRegFormat
  }

  implicit object _1 extends TwoOp[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    val format = MemRegFormat
  }

  implicit object _2 extends TwoOp[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    val format = MemRegFormat
  }

  implicit object _3 extends TwoOp[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xC1) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
  }
}
