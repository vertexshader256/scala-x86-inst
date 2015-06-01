package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - parity/parity even (PF=1)
// Category: general/datamov

trait CMOVP extends InstructionDefinition {
  val mnemonic = "CMOVP"
}

object CMOVP extends TwoOperands[CMOVP] with CMOVPImpl

trait CMOVPImpl extends CMOVP {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4A) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4A) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4A) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
