package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not parity/parity odd
// Category: general/datamov

trait CMOVNP extends InstructionDefinition {
  val mnemonic = "CMOVNP"
}

object CMOVNP extends TwoOperands[CMOVNP] with CMOVNPImpl

trait CMOVNPImpl extends CMOVNP {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
