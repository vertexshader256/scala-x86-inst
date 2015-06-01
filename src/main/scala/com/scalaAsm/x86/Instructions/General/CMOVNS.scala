package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not sign (SF=0)
// Category: general/datamov

trait CMOVNS extends InstructionDefinition {
  val mnemonic = "CMOVNS"
}

object CMOVNS extends TwoOperands[CMOVNS] with CMOVNSImpl

trait CMOVNSImpl extends CMOVNS {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x49) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
