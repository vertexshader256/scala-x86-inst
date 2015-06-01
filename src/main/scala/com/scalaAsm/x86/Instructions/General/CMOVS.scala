package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - sign (SF=1)
// Category: general/datamov

trait CMOVS extends InstructionDefinition {
  val mnemonic = "CMOVS"
}

object CMOVS extends TwoOperands[CMOVS] with CMOVSImpl

trait CMOVSImpl extends CMOVS {
  implicit object CMOVS_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    val format = RegRmFormat
  }

  implicit object CMOVS_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    val format = RegRmFormat
  }

  implicit object CMOVS_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
