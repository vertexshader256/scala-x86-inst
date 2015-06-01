package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not overflow (OF=0)
// Category: general/datamov

trait CMOVNO extends InstructionDefinition {
  val mnemonic = "CMOVNO"
}

object CMOVNO extends TwoOperands[CMOVNO] with CMOVNOImpl

trait CMOVNOImpl extends CMOVNO {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x41) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x41) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x41) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
