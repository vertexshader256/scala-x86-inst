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
  implicit object CMOVNP_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    val format = RegRmFormat
  }

  implicit object CMOVNP_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    val format = RegRmFormat
  }

  implicit object CMOVNP_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4B) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
